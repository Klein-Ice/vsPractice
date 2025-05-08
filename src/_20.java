import java.util.*;

public class _20 {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char[] cs = s.toCharArray();
        int n = cs.length;
        for(char ch : cs){
            if(ch=='('){
                deque.push(')');
            }else if(ch=='{'){
                deque.push('}');
            }else if(ch == '['){
                deque.push(']');
            }else if(deque.isEmpty()||deque.peek()!=ch){
                return false;
            }else{
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
