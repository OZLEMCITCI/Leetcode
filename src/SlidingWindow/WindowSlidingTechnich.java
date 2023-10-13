package SlidingWindow;

public class WindowSlidingTechnich {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        System.out.println(maxSum(arr,4));
    }

    public static int maxSum(int[] arr, int k){

        int arrLenght= arr.length;

        if(arrLenght<k){
            return -1;
        }
        int currentSum=0;

        int max_sum=0;

        for(int i=0;i<k;i++){
            currentSum+=arr[i];
        }
        max_sum=currentSum;
        for(int i=k;i<arrLenght;i++){
            currentSum += arr[i] -arr[i-k];

            max_sum=Math.max(currentSum,max_sum);
        }
        return max_sum;


    }
}
