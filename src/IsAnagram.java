import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hasMaps=new HashMap<>();

       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           hasMaps.put(ch,hasMaps.getOrDefault(ch,0)+1);
       }

        HashMap<Character,Integer>hashMapt=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            hashMapt.put(ch,hashMapt.getOrDefault(ch,0)+1);
        }

     return hashMapt.equals(hasMaps);

    }
}
