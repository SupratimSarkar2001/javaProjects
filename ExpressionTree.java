import java.util.Stack;

class Node{
	char data;
	Node left;
	Node right;
	public Node(char d) {
		data=d;
		left= right= null;
	}
}
public class ExpressionTree {
	
	
	boolean isOperator(char c) {
		if(c=='+' || c=='*' || c=='-' || c=='/' || c=='^') {
			return true;
		}
		else {
			return false;
		}
	}
	
	void Inorder(Node root) {
		if(root == null) {
			return;
		}
		else {
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
	}
	Node makeExpressionTree(char[] pex) {
		Node t;
		Node t1;
		Node t2;
        Stack<Node> st = new Stack<Node>();

        for(int i=0 ;i<pex.length;i++){
            if(!isOperator(pex[i])){
                t=new Node(pex[i]);
                st.push(t);
            }
            else{
                t=new Node(pex[i]);
                t1=st.pop();
                t2=st.pop();

                t.right=t1;
                t.left=t2;

                st.push(t);
            }
        }

        t= st.pop();

        return t;
	}

	public static void main(String[] args) {
		ExpressionTree tree= new ExpressionTree();
        String postfix="ab+ef*g*-";
        char[] pex= postfix.toCharArray();
        Node t=tree.makeExpressionTree(pex);

        System.out.println("infix expression is :");
        tree.Inorder(t);



	}

}