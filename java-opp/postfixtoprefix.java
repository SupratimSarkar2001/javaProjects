import java.util.Stack;

public class postfixtoprefix {
    static boolean isOperator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;

        }
        return false;
    }
    static String prefix(String post_exp)
    {
        Stack<String> s = new Stack<String>();
 
        // length of expression
        int length = post_exp.length();
 
        // reading from right to left
        for (int i = 0; i < length; i++) {
 
            // check if symbol is operator
            if (isOperator(post_exp.charAt(i))) {
 
                // pop two operands from stack
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
 
                // concat the operands and operator
                String temp
                    = post_exp.charAt(i) + op2 + op1;
 
                // Push String temp back to stack
                s.push(temp);
            }
 
            // if symbol is an operand
            else {
 
                // push the operand to the stack
                s.push(post_exp.charAt(i) + "");
            }
        }
        return s.pop();


    }


    public static void main(String[] args){
        String exp="ABC/-AK/L-*";
        System.out.println("prefix expression is :"+prefix(exp));
    }
    
}
