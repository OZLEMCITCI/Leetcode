package interview;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kroger {

    public static void main(String[] args) {
       swapNumbers(6,7);
        System.out.println(hasInteger("hello"));

        String testString = "Hello,   World!123";
        System.out.println(countCharacters(testString));
    }

    public static void swapNumbers(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x is :"+x);
        System.out.println("y is :"+y);

    };

    public static boolean hasInteger(String str){
        if(str.contains("0")
                ||str.contains("1")
                ||str.contains("2")
                ||str.contains("3")
                ||str.contains("4")
                ||str.contains("5")
                ||str.contains("6")
                ||str.contains("7")
                ||str.contains("8")
                ||str.contains("9")) {
            return false;

        }else{
            return true;
        }

    };
    public static boolean hasNoInteger(String str){

        for(char a: str.toCharArray()){
            if(Character.isDigit(a)){
                return false;
            }
        }

        return true;
    };
//    Write a Java method that accepts a string and performs the following tasks:
//    Counts the number of uppercase letters in the string.
//    Counts the number of lowercase letters in the string.
//    Counts the number of digits in the string.
//    Counts the number of special characters (any character that is not a letter or a digit) in the string.

    public static String countCharacters(String str){

        str=str.replaceAll(" ","");

 ////functional programing, declarative programing
        int uppercase= (int) str.chars().filter(Character::isUpperCase).count();
        int lowerCase=(int)str.chars().filter(Character::isLowerCase).count();
        int digits=(int)str.chars().filter(Character::isDigit).count();
        int specialChars=(int)str.chars().filter(x->!Character.isLetterOrDigit(x)).count();



////procedural programing
//        int uppercase=0;
//        int lowerCase=0;
//        int digits=0;
//        int specialChars=0;
//        for(char c:str.toCharArray()){
//
//            if(Character.isDigit(c)){
//                digits++;
//            } else if (Character.isUpperCase(c)){
//                uppercase++;
//            }else if(Character.isLowerCase(c)){
//                lowerCase++;
//            } else {
//                specialChars++;
//            }
//
//
//        }

        return "Uppercase letters:"+ uppercase+ ", Lowercase letters:" +lowerCase+", Digits:"+ digits+", Special characters:"+specialChars;
    }
}
