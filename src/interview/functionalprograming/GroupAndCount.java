package interview.functionalprograming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndCount {
//    Write a function called groupAndCount that takes an array of strings as input and returns
//    an object (or a map in Java)
//    that groups the strings by their length and counts the number of strings with the same length.
//    Your solution should use functional programming concepts.

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "kiwi", "pear", "plum");
        System.out.println(groupAndCount(input));
    }


    public static Map<Character,Integer> groupByFirstLetter (List<String> strings){
        Map<Character,Integer>result=new HashMap<>();

        strings.stream().collect(Collectors.groupingBy(x->x.charAt(0)))
                .forEach((firstChar,list)->{
                    result.put(firstChar, list.size());
                });

       return result;

    }
    public static Map<Integer,Integer> groupAndCount(List<String> strings){

        Map<Integer,Integer> result=new HashMap<>();
        strings.stream()
                .collect(Collectors.groupingBy(String::length))
                .forEach((length,list)->{
                    result.put(length,list.size());
                });

        return result;

    }
    public static Map<Integer,Integer> groupAndSum(List<Integer> ints){


        return ints.stream().collect(Collectors.groupingBy(x->x%10,Collectors.summingInt(x->x)));


    }
}
