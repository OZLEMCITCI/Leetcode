import java.util.*;

public class ValidParanthses {
    public boolean isValid(String s) {

        Map<Character,Character>hasMap= Map.of('(',')','{','}','[',']');
       // Stack<Character> stack=new Stack<>();
        LinkedList<Character>linkedList=new LinkedList<>();

        for(char c: s.toCharArray()){
            if(hasMap.containsKey(c)){
                //stack.push(c);
                linkedList.push(c);
            }else{
             //   if(stack.empty() || linkedList.isEmpty()){
                    if( linkedList.isEmpty()){
                    return false;
                }
               // char temp=stack.pop();
                char temp=linkedList.pop();
                if(hasMap.get(temp)!=c){
                    return false;
                }
            }
        }

       // if(stack.empty()){
            if(linkedList.isEmpty()){
            return true;
        }

        return false;
    }
}
