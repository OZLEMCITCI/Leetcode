import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {

//HashMap<Character,Integer> hashMap=new HashMap<>();
//
//for(int i=0;i<s.length();i++){
//    char key = s.charAt(i);
//    hashMap.put(key,hashMap.getOrDefault(key,0)+1);
//
//}
//
//for(int i=0;i<s.length();i++){
//    if(hashMap.get(s.charAt(i))==1){
//        return i;
//    }
//}
//
//return -1;

//            if(s.charAt(i)=='-'){
//                continue;
//            }
//            if(s.substring(i+1).contains(s.charAt(i)+"")){
//                s=s.replace(s.charAt(i),'-');
//            }else{
//                return i;
//            }

        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }

    }

