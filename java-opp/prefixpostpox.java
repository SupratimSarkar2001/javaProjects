import java.util.Stack;

public class prefixpostpox {
    static boolean isOperator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return  true;
        }
        return false;
    }

    static String postfix(String str){
        Stack<String> stack = new Stack<>();
        int l= str.length();
       
        for(int i=l-1; i>= 0;i--){
            char c = str.charAt(i);
            if(isOperator(c)){
                String s1= stack.pop();
                String s2= stack.pop();
                String  temp = s1+s2+c;
                stack.push(temp);
            }
            else{
                stack.push(c+" ");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        String exp="*-A/BC-/AKL";
        System.out.println("Postfix expresion:"+postfix(exp));
    }
    
}
