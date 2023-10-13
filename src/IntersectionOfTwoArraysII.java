import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {

        int [] nums1={4,5,6,6};  //0:4 1:5, 2:6, 3:6    if
        int []nums2={5,6,6};
       // System.out.println(Arrays.toString(intersect(nums1,nums2)));
        System.out.println(Arrays.toString(intersect2(nums1,nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        int[] intArray;

        int counter=0;
        if(nums1.length>=nums2.length){
            intArray= new int[nums2.length];


            for(int i=0;i<nums1.length;i++){
               int j=0;

               if(nums1[i]==nums2[j]){

                  while(nums1[i]==nums2[j]){
                   intArray[counter]=nums2[j];
                   j++; i++; counter++;}
               }

            }
        }else{
            intArray=new int[nums1.length];

            for(int i=0;i<nums2.length;i++){
                int j=0;

                if(nums1[j]==nums2[i]){

                    while(nums1[j]!=nums2[i]){
                        intArray[counter]=nums1[j];
                    j++; i++; counter++;}
                }

            }
        }

        return intArray;

    }

    public static int[] intersect2(int[] nums1, int[] nums2) {

        if(nums1.length<nums2.length){
            return intersect(nums2,nums1);
        }
         Map<Integer,Integer> hasMap=new HashMap<>();

         Arrays.stream(nums1).parallel().forEach(x->{
             hasMap.put(x,hasMap.getOrDefault(x,0)+1);
         });

         List<Integer> tempList=new ArrayList<>();


         for(Integer num2: nums2){
             int containKey=hasMap.getOrDefault(num2,0);

             if(containKey>0){
                 tempList.add(num2);
                 hasMap.replace(num2,hasMap.get(num2)-1);
             }
         }

         int k=0;

         for(Integer num: tempList){

         }

        System.out.println(hasMap);

        return Arrays.copyOfRange(nums1,0,k);


    }



}
