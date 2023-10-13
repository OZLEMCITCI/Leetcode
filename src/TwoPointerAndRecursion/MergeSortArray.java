package TwoPointerAndRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortArray {
    public static void main(String[] args) {

        int[] nums1={3,4,5,0,0};
        int [] nums2={1,2};
     merge(nums1,3,nums2,2);

        System.out.println(maxSortList(List.of(3,4,5),List.of(1,2)));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertIndex = m + n - 1;


        int indexA = m - 1;

        int indexB = n - 1;

        while (indexB >= 0) {

            if (indexA < 0) {
                nums1[insertIndex] = nums2[indexB];
                insertIndex--;
                indexB--;

            } else {
                if (nums1[indexA] < nums2[indexB]) {
                    nums1[insertIndex] = nums2[indexB];
                    insertIndex--;
                    indexB--;

                } else {
                    nums1[insertIndex] = nums1[indexA];
                    insertIndex--;
                    indexA--;

                }

            }
        }

        System.out.println(Arrays.toString(nums1));

    }
 public static List<Integer>  maxSortList(List<Integer> list1,List<Integer> list2){
        List<Integer>list=new ArrayList<>();

        int list1size=0;
        int list2size=0;
        while(list1size<list1.size() && list2size<list2.size()){
            if(list1.get(list1size)<list2.get(list2size)){
                list.add(list1.get(list1size++));
            }else{
                list.add(list2.get(list2size++));
            }
        }

        if(list1size<list1.size()){
            while(list1size<list1.size()){
                list.add(list1.get(list1size++));
            }
        }

     if(list2size<list2.size()){
         while(list2size<list2.size()){
             list.add(list2.get(list2size++));
         }
     }
      return list;
 }

}

