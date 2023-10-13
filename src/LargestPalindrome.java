public class LargestPalindrome {

    public static void main(String[] args) {

        System.out.println(isLargest(19,11));
        System.out.println(isPalindrome(10));

    }
    public static int isLargest(int largestPossible, int smallestPossible){
        int result;
        int largestPalindrome=0;
        int firstNumber=0;
        int secondNumber=0;


        for(int i=smallestPossible; i<=largestPossible ;i++){
            for(int j=largestPossible; j>=smallestPossible;j--){
                result=i*j;

                if(isPalindrome(result)){
                    firstNumber=i;
                    secondNumber=j;
                    largestPalindrome=Math.max(largestPalindrome,result);

                }
            }
        }
        System.out.println(firstNumber+" "+secondNumber);

        return largestPalindrome;


    }


    public static boolean isPalindrome(int number){

        StringBuilder isPalindrome=new StringBuilder(String.valueOf(number));

        if(String.valueOf(number).equals(isPalindrome.reverse().toString())){
            return true;
        }

        return false;


    }
}
