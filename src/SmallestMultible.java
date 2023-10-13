public class SmallestMultible {

    public static void main(String[] args) {
        System.out.println(smallestMultiple(10));
    }

    public static int smallestMultiple (int upperLimit){

        int result=2;
        for(int i =3;i<=upperLimit;i++){
            if(!(result%i==0)){
                result*=i;
            }
        }
        return result;
    }
}
