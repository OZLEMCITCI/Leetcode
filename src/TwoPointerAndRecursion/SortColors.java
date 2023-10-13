package TwoPointerAndRecursion;

import java.util.HashMap;

public class SortColors {

    public void sortColors(int[] nums) {

        if(nums.length==1){
            return;
        }
        HashMap<Integer,Integer>hashMap=new HashMap<>();

        for(Integer color: nums){
            hashMap.put(color, hashMap.getOrDefault(color,0)+1);
        }

        int count=0;

        if(hashMap.containsKey(0)){
            for(int i=0;i<hashMap.get(0);i++){
                nums[count++]=0;
            }
        }


        if(hashMap.containsKey(1)){
        for(int i=0;i<hashMap.get(1);i++){
            nums[count++]=1;
        }}

        if(hashMap.containsKey(2)){
            for(int i=0;i<hashMap.get(2);i++){
                nums[count++]=2;
            }
        }




    }
}
