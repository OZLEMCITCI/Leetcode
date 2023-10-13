import java.util.ArrayList;
import java.util.List;

public class Factoriel {

    public static void main(String[] args) {

        System.out.println(factorielWithRecursion(4));
    }

    public static int findFactoriel(int n){

        List<Integer> factorielList= new ArrayList<>();

        factorielList.add(1);

        for(int i=1;i<=n;i++){
            int e = factorielList.get(i-1) * (i);
            factorielList.add(e);
        }
        System.out.println(factorielList);

        return factorielList.get(n);
    }

    public static int findFactorielwithArr(int n){
        int [] factorielArry=new int[n+1];
        factorielArry [0]=1;
        int i=1;
        while(i<=n){
            factorielArry [i]=factorielArry[i-1]*i;
            i++;
        }
        return factorielArry[n];
    }

    public static int factorielWithRecursion(int n){

        if(n==0){
            return 1;
        }

        return factorielWithRecursion(n-1)*n;
    }

}
