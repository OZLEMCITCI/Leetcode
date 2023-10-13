import java.util.HashMap;
import java.util.Map;

public class CommonElement {

    public static void main(String[] args) {
        String[] arr1={"a"};
        String[] arr2={"a"};

        System.out.println(isCommonElement(arr1,arr2));
    }

    public static boolean isCommonElement(String [] arr1,String [] arr2){

        Map <String,Boolean> hasMap=new HashMap<>();

        for(String str:arr1){
            hasMap.put(str,true);
        }

        for(String str:arr2){
            if(hasMap.containsKey(str)){
                return true;
            }
        }

        return false;
    }
}
