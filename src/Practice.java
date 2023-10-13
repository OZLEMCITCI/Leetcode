import java.util.*;

public class Practice {

    public static void main(String[] args) {

        System.out.println(generate(2));

    }
//practice made
    public static int findFactoriel(int n){
        return 1;
    }

    public static boolean primeNumber(int isPrimeNumber){
return true;
    }

    public static int listsFibo(int i){
return 1;
    }

    public static long largestPrime(long number){
return 1l;
    }

    public static int multipleOf3Or5 (int n){
return 1;
    }

    public static boolean isPalindromeString(int number){

        return false;

    }

    public static boolean isPalindromeNumber(int number){

        return true;

    }

    public static int isLargestPalindrome(int largestPossible, int smallestPossible){

        return 0;

    }

    public static int maxSubArray(int[] nums) {

        return 2;



    }

    public static int maxTwoSubArray(int[] nums) {
        int twoSum=Integer.MIN_VALUE;
        int maxTwoSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length-2;i++){
            twoSum=Math.max(nums[i]+nums[i+1]+nums[i+2],twoSum);
            System.out.println(twoSum);
            maxTwoSum=Math.max(maxTwoSum,twoSum);
        }

        return maxTwoSum;

    }

    public static int maxOfGivenSizeOfSubArray(int[] nums) {
        int twoSum=Integer.MIN_VALUE;
        //int maxTwoSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length-2;i++){
            twoSum=Math.max(nums[i],nums[i+1]);
            twoSum=Math.max(twoSum,nums[i+2]);
            System.out.println(twoSum);
            twoSum=Integer.MIN_VALUE;


        }

        return twoSum;

    }

    public static int findsubArrayReachToGivenNumber (int[] arr ,int sum, int n) {

//    int sum=nums[0];
//    int beginningIndex=0;
//    for(int i=1;i<nums.length;i++){
//        sum+=nums[i];
//
//        if(sum==k){
//            return Arrays.copyOfRange(nums,beginningIndex,i+1);
//        }
//
//        if(sum>k && start<i-1){
//            sum-=nums[start];
//            beginningIndex=++;
//        }

        int curr_sum = arr[0], start = 0;

        // Pick a starting point
        for (int i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            curr_sum = curr_sum + arr[i];

            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                int p = i;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }

// Add this element to curr_sum
            //if (i < n)
                //curr_sum = curr_sum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;

    }



    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap=new HashMap<>();
        int [] resultAarr=new int[2];
        int complement;
        for(int i=0;i<nums.length;i++){
            complement=target-nums[i];

            if(numsMap.containsKey(complement) && i!=numsMap.get(complement)){
                resultAarr[0]=numsMap.get(complement);
                resultAarr[1]=i;
                break;
            }

            numsMap.put(nums[i],i);


        }

        return resultAarr;

    }

    public static void mergeTwoArray (int[] nums1, int m, int[] nums2, int n) {
        int indexA=m-1;
        int indexB=n-1;
        int placemeantIndex=m+n-1;

        while(indexB>=0){
            if(indexA<0){
                nums1[placemeantIndex--]=nums2[indexB--];
            }else if(nums1[indexA]<nums2[indexB]){
                nums1[placemeantIndex--]=nums2[indexB--];
            }else{
                nums1[placemeantIndex--]=nums1[indexA--];
            }

        }

    }

    public int maxProfit(int prices[]) {
        int minPrice=Integer.MAX_VALUE;
        int totalMax=0;
        for (int price:prices){
            minPrice=Math.min(minPrice,price);
            totalMax=Math.max(totalMax,price-minPrice);
        }
        return totalMax;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalTriangle=new ArrayList<>();

        pascalTriangle.add(List.of(1));

        if(numRows==1){
            return pascalTriangle;
        }


        pascalTriangle.add(List.of(1,1));
        if(numRows==2){
            return pascalTriangle;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1; i<numRows-1;i++){

            list.add(1);
            int sum;
            for(int j=0;j<pascalTriangle.get(i).size()-1;j++){
                 sum=pascalTriangle.get(i).get(j)+pascalTriangle.get(i).get(j+1);
            list.add(sum);
            }
            list.add(1);
            pascalTriangle.add(List.copyOf(list));
            list.clear();
        }


        return pascalTriangle;

    }



}
