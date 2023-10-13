package Review;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];

            if(hashMap.containsKey(complement)){

                int[] arr=new int[2];
                arr[0]=hashMap.get(complement);
                arr[1]=i;
                return arr ;
            }

            hashMap.put(nums[i],i);
        }

        return null;
    }
}
