package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubArrayWithoutRepeating {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int left=0;
        int right=1;
        int length=1;


        Set<Character> hasSet=new HashSet<>();

       // StringBuilder subStr= new StringBuilder(""+s.charAt(left));

      hasSet.add(s.charAt(left));


        while(right<s.length()){

//            if(!subStr.toString().contains("" + s.charAt(right))){
//               subStr.append(s.charAt(right++));
//            }else{
//                left++;
//                subStr = new StringBuilder(s.substring(left, right));
//
//
//            }

            if(!hasSet.contains(s.charAt(right))){
                hasSet.add(s.charAt(right++));

            }else{
                hasSet.remove(s.charAt(left++));

            }


            length=Math.max(length,hasSet.size());

        }

        return length;

    }
    public static int lengthOfLongestSubstring2(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}
