package interview.suleyman;

public class ArmStrongnumber {
/*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/

    public static boolean isArmStrong(int number){

        int tempNumber=0;
        String [] strArray=String.valueOf(number).split("");

        for(String i:strArray){
            int value=Integer.parseInt(i);
            tempNumber+=Math.pow(value,strArray.length);
        }

        return tempNumber == number;

    }
}
