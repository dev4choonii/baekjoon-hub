import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
        
    boolean solution(String s) {
        boolean answer = true;

        //code
        Stack<Character> syntaxStack = new Stack<>();
        
        char[] syntaxArray = s.toCharArray();
        boolean isClosed = false;

        for (char syntax : syntaxArray) {
            if ('(' == syntax) {
                syntaxStack.push(syntax);
                isClosed = false;
            } else if (')' == syntax) {
                isClosed = true;

                if (syntaxStack.isEmpty()) {
                    answer = false;
                    break;
                }
                
                syntaxStack.pop();
            }
        }
        
        if (!syntaxStack.isEmpty()) {
            answer = false;
        }

        answer = isClosed && answer;

        //////////////////////////////

        return answer;
    }
}