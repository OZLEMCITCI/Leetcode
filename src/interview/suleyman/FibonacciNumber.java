package interview.suleyman;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibboNumbers(50));
    }

    public static List<Integer> fibboNumbers(int limit){


        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(1);
 //with iterator method
//        Stream.iterate(new ArrayList<>(list1),list->{
//          list.add(list.get(list.size()-1)+ list.get(list.size()-2));
//          return list;
//        });
        for(int i=2;i<limit;i++){
            list1.add(list1.get(i-1)+ list1.get(i-2));
        }
        return list1;
    }
}
