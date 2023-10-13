import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("ccabb","cccbbbba"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
//        Map<Character,Integer> ransomMap=new HashMap<>();
//     for(int i=0;i<ransomNote.length();i++){
//         char s=ransomNote.charAt(i);
//         ransomMap.put(s,ransomMap.getOrDefault(s,0)+1);
//     }
//
//        Map<Character,Integer> magazineMap=new HashMap<>();
//        for(int i=0;i<magazine.length();i++){
//            char s=magazine.charAt(i);
//            magazineMap.put(s,magazineMap.getOrDefault(s,0)+1);
//        }
//
//        for(int i=0;i<ransomNote.length();i++){
//            char s=ransomNote.charAt(i);
////
////            if(magazineMap.containsKey(s)&& magazineMap.get(s)>=ransomMap.get(s)){
////            }else{
////                return true;
////            }
//            if(magazineMap.getOrDefault(s,0)!=0){
//                magazineMap.replace(s, magazineMap.get(s)-1);
//            }else{
//                return false;
//            }
//
//        }
//
//       return true;

        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            int i1 = c - 'a';
            map[i1] ++;
        }

        for (char c : ransomNote.toCharArray()) {
            int value = map[c - 'a'];

            if (value <= 0) {
                return false;
            }
            map[c - 'a']--;

        }
        return true;

    }
}
