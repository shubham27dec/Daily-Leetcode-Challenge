import java.util.Stack;

public class July112024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String reverseParentheses(String s) {
            int n=s.length();
            Stack<StringBuilder> stack = new Stack<>();
            StringBuilder str = new StringBuilder();
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(ch=='('){
                    stack.push(str);
                    str=new StringBuilder();
                }
                else if(ch==')'){
                    str.reverse();
                    if(!stack.isEmpty()){
                        stack.peek().append(str);
                        str=stack.pop();
                    }
                }
                else str.append(ch);
            }
            return str.toString();
        }
    }
}
