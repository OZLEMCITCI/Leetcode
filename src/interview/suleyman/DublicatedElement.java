package interview.suleyman;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicatedElement {


    public static void main(String[] args) {
        List<Integer> lsit=new ArrayList<>();
        lsit.add(1);
        lsit.add(2);
        lsit.add(3);
        lsit.add(2);
        removeDuplicated(lsit);
        System.out.println(lsit);
    }

    public static void removeDuplicated(List<Integer> list){
        ArrayList<Integer> listTem = new ArrayList<>(new LinkedHashSet<>(list));
        
        list.clear();
        list.addAll(listTem);
        }
    }

