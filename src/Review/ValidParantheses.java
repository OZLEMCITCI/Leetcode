package Review;

import java.util.Map;
import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Map<Character,Character> map=Map.of('(',')','{','}','[',']');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                if(map.get(stack.peek()).equals(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }

        }

        if(stack.isEmpty()){
            return true;
        }
         return false;

    }
}
