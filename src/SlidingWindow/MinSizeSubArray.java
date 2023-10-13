package SlidingWindow;

public class MinSizeSubArray {

    public static void main(String[] args) {

        int []nums={10,2,3};
        System.out.println(minSubArrayLen(6,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        if(nums.length==0){
            return 0;
        }
        int left=0;
        int sum=nums[left];
        if(sum>=target){
            return 1;
        }
        if(nums.length==1){
            if(sum>=target){
                return 1;
            }
        }


        int minLength=Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
                while(sum>=target){
                minLength=Math.min(minLength,i-left+1);
                sum-=nums[left++];}



        }

//        int minLen = Integer.MAX_VALUE;
//        int l = 0;
//        int r = 0;
//        int sum = 0;
//        while(r < nums.length) {
//            sum += nums[r];
//            while(sum >= target && l <= r) {
//                minLen = Math.min(minLen, r - l + 1);
//                sum -= nums[l++];
//            }
//            r++;
//        }
//        return minLen == Integer.MAX_VALUE ? 0 : minLen;

       return minLength==Integer.MAX_VALUE?0:minLength;



    }
}
