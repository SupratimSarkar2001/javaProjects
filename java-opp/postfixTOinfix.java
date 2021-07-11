import java.util.Stack;

public class postfixTOinfix {
    static boolean isOperand( char c){
        if((c>='A'&& c<='Z') || (c>='a'&& c<='z')){
            return true;
        }
        return false;
    }
    static String infix(String exp){
        Stack<String> stack= new Stack<>();
        String result= " ";
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(isOperand(c)){
                stack.push(c+" ");
            }
            else{
                String s1= stack.pop();
                String s2= stack.pop();

                String temp="("+s2+c+s1+")";
                stack.push(temp);
            }
        }

        return stack.peek();
    }


    public static void main(String[] args){
        String exp= "ab*c+";
        System.out.println("infix expression is :"+infix(exp));
    }
    
}
