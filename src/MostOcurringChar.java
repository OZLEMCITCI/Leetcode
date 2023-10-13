import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostOcurringChar {
//
//    Write a function maxOccurringChar that takes a string as input, and returns the character
//    that appears the most times in the string.
//    If there are multiple characters that appear the most times, return any one of them.
//    You may assume that the string is not empty and only contains lowercase English letters.

    public static void main(String[] args) {
        System.out.println(mostOccuringChar("oooozzzzzllll"));
        System.out.println(mostOccuringCharWithStream("ozz"));
    }

    public  static String mostOccuringChar(String str){

        String mostOccure="";
        int counter=0;
        HashMap<String,Integer> hashMap=new HashMap<>();

        for (String s:str.split("")) {
            int count=hashMap.getOrDefault(s,0)+1;
            hashMap.put(s,count);

            if(counter<count){
                mostOccure=s;
                counter=count;
            }
        }
        return mostOccure;

    }

    public  static String mostOccuringCharWithStream(String str) {

         return str.chars().mapToObj(c->(char)c)
                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                 .entrySet()
                 .stream().max(Map.Entry.comparingByValue())
                 .map(Map.Entry::getKey).toString();


      
    };

//    Write a Java function that takes a List of strings as input, and returns
//    the string that appears most frequently in the list.
//    If there are multiple strings that appear most frequently, return any one of them.

    public static String mostOccuringString(List<String> stringList){
        return stringList
                .stream()
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("noting");
    }
    }
