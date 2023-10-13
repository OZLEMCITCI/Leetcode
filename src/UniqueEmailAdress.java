import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAdress {

    public static void main(String[] args) {


        String [] arr={"a@leetcode.com","b@leetcode.com","c@leetcode.com"};

        System.out.println( checkEmail(arr));

    }


    public static   int checkEmail(String emails[]){


        HashSet<String> uniqueEmail=new HashSet<>();

        for(String email:emails){
            String [] splitEmail=email.split("@");

            String part="";

            if(splitEmail[0].contains("+")){
                part=splitEmail[0].substring(0,splitEmail[0].indexOf("+"));
            }

            //part=part.replaceAll("\\.","");

            System.out.println(part+"@"+splitEmail[1]);
            uniqueEmail.add(part+"@"+splitEmail[1]);


        }

        return uniqueEmail.size();
    }


}

