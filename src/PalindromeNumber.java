public class PalindromeNumber {

    public static void main(String[] args) {
        //System.out.println(isPalindrome(123221));
        System.out.println(isPalindromeNumber(121));
    }

    public static boolean isPalindrome(int number){

        String[] numberString=String.valueOf(number).split("");

        int left=0;
        int right=numberString.length-1;
        boolean flag=true;

        while(left<=numberString.length/2){
            if(!(numberString[left].equals(numberString[right]))){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        return flag;

    }

    public static boolean isPalindromeNumber(int number){

        int reverse=0; //
        int initialNumbers=number; //number her seferinde divide oluyor o yuzden kaydediyoruz
        while(number>0){ //number<9 oldugunda 10'a bolumunden kalan sifir olur yuzden son
            //loop number>0 oldukca yapmaliyiz
            reverse=(reverse*10)+number%10;//reverse ekliyoruz mesela 12*10=120 +3=123
            number=number/10;
        }
        if(initialNumbers==reverse){
            return true;
        }else{
            return false;
        }

    }

    public static boolean isPalindromeStringBuilder(int number){

        StringBuilder isPalindrome=new StringBuilder(String.valueOf(number));

        if(String.valueOf(number).equals(isPalindrome.reverse().toString())){
            return true;
        }

        return false;


    }

}


