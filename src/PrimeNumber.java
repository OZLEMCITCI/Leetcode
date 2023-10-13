public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primeNumber(13));
    }

    public static boolean primeNumber(int isPrimeNumber){

        int i=2;
        boolean flag= false;
        while(i<=isPrimeNumber/2){
            if(isPrimeNumber%i==0){
                flag=true;
                break;
            }
            i++;
        }
        return !flag;

    }
}
