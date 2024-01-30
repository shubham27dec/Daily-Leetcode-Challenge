import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class January302024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> operands = new Stack<>();
            List<String> operators = new ArrayList<>(List.of("+","-","*","/"));
            int operand1 = 0;
            int operand2 = 0;
            for(String token : tokens){
                if(operators.contains(token)){
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    int intermediateCalculation = 0;
                    switch(token){
                        case "+" -> intermediateCalculation = (operand1 + operand2);
                        case "-" -> intermediateCalculation = (operand1 - operand2);
                        case "*" -> intermediateCalculation = (operand1 * operand2);
                        case "/" -> intermediateCalculation = (operand1 / operand2);
                    }
                    operands.push(intermediateCalculation);
                }
                else{
                    operands.push(Integer.valueOf(token));
                }
            }
            return operands.pop();
        }
    }
}
