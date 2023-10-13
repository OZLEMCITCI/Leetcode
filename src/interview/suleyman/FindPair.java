package interview.suleyman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindPair {
    public static List<Integer> findPair(List<Integer> list,int target){

        HashMap<Integer, Integer> hashMap=new HashMap<>();
        List<List<Integer>> resonse=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            int pair=target- list.get(i);

            if(hashMap.containsKey(pair)){

            }else{
                hashMap.put(pair,i);
            }
        }
    }
}
