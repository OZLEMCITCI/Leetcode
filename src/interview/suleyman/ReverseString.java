package interview.suleyman;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {
        //System.out.println(reverseAString("Ozlem"));

        ReverseString reverseString=new ReverseString();
        reverseString.reverseAString("");
    }

    public String reverseAString(String str){
        ///two pointer

        List<String> list=Arrays.asList(str.split(""));

        int left =0;
        int right =str.length()-1;
        while(left<right){
            String temp= list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        return String.join("", list);



    };

    public String reverseAString2(String str){
        return str.chars().mapToObj(x->(char)x).collect(Collectors.collectingAndThen(Collectors.toList(),list->{
            Collections.reverse(list);
            return list.stream().map(String::valueOf).collect(Collectors.joining(""));
        }));


    };
//    int left=0;
//    int right= str.length()-1;
//
//
//    StringBuilder stringBuilder=new StringBuilder(str);
//
//
//        while(left<right){
//        char swap=str.charAt(left);
//
//
//        stringBuilder.setCharAt(left,stringBuilder.charAt(right));
//        stringBuilder.setCharAt(right,swap);
//        left++;
//        right--;
//    }
//        String.valueOf(5);
//
//        return stringBuilder.toString();


}
