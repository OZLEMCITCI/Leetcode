import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiboNumbers {

    public static void main(String[] args) {

        HashMap<Long,Long> hashMap=new HashMap<>();

        //System.out.println(fib(50f,hashMap));
       // System.out.println(fibo2(50l,hashMap));
        //System.out.println(arraysFibo(9l));
        //System.out.println(fibo(9));

        System.out.println(listsFibo(5));

        //System.out.println(normal(4));
    }

    public static int fibo(int i){
        if(i<=2){
            return 1;
        }
        return fibo(i-1)+fibo(i-2);

    }

    public static Long fibo2(Long i, Map<Long,Long> hashMap){

        if(i ==0){
            return 0L;
        }

        if(i ==1){
            return 1L;
        }
        if(hashMap.containsKey(i)){
            return hashMap.get(i);
        }

        Long fiboNumber=fibo2(i-1,hashMap)+fibo2(i-2,hashMap);

       hashMap.put(i,fiboNumber);

        return fiboNumber;


    }

    public static Float fib(Float n, Map<Float,Float> map){

        if(n ==0){
            return 0F;
        }

        if(n ==1){
            return 1F;
        }

        if(map.containsKey(n)){
            return map.get(n);
        }

        Float fibForN = fib(n-1,map) + fib(n-2,map);
        map.put(n, fibForN);

        return fibForN;

    }

    public static int normal(int i){
        if(i==1){
            return 1;
        }

        System.out.println("hello");

        return normal(i-1) +normal(i-1)+normal(i-1);
    }

    public static Long arraysFibo(Long i){

        long [] arr= new long[Math.toIntExact(i)+1];

        arr[0]=0l;
        arr[1]=1l;

        for(int k=2;k<=i;k++){

            arr[k]=arr[k-1]+arr[k-2];
        }

        return arr[Math.toIntExact(i)];

    }

    public static int listsFibo(int i){

       List<Integer> fibboList=new ArrayList<>();

       fibboList.add(1);
       fibboList.add(1);

       int n=2;
       while(fibboList.size()<i){
           fibboList.add(fibboList.get(n-1)+fibboList.get(n-2));
           n++;
       }

        System.out.println(fibboList);
       return 1;

    }



}
