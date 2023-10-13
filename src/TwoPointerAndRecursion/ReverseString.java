package TwoPointerAndRecursion;

import javax.print.DocFlavor;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStringRecursivly("e"));
        System.out.println(reverseStringWithQueue("e"));

//    public static String reverseString (String str){
////        String [] tempArry=str.split("");
////        String temp;
////        for(int i=0;i<tempArry.length/2;i++){
////             temp=tempArry[i];
////             tempArry[i]=tempArry[tempArry.length-1-i];
////            tempArry[tempArry.length-1-i]=temp;
////        }
////        for(String s:tempArry){
////            System.out.print(s);
////        }
//
////        for(int i=str.length()-1;i>=0;i--){
////            System.out.print(str.charAt(i));
////        }
//
////        StringBuilder hello=new StringBuilder(str);
////        hello.append("kalem");
////        return hello.reverse().toString();
//
//    }
    }
    public static String reverseStringRecursivly(String str){

        if(str==null || str.length()<=1){

            return str;

        }
        char c = str.charAt(0);
        String s = reverseStringRecursivly(str.substring(1));
        return s +c;

    }

    public static String reverseStringWithQueue(String str){
        Stack<String> stringStack=new Stack<>();

        for(int i=0;i<str.length();i++){
            stringStack.push(str.substring(i,i+1));
        }

        StringBuilder str2=new StringBuilder(str.length());
        while(!stringStack.empty()){
            str2.append(stringStack.pop());
        }

        return str2.toString();

    }


}
