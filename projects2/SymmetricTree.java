package projects2;
class Node{
	int data;
	Node left;
    Node right;
    public Node(int d) {
    	data=d;
    	left= right= null;
    }
}

public class SymmetricTree {
	
	Node root;
	
	boolean issymmetric() {
		return isMirror(root,root);
		
	}
	
	boolean isMirror(Node n1 , Node n2) {
		 if( n1== null && n2== null) {
			 return true;
		 }
		 if(n1 != null && n2 != null && n1.data== n2.data) {
			 return(isMirror(n1.left,n2.right) && isMirror(n1.right, n2.left) );
		 }
		 return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree tree = new SymmetricTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        
        boolean res= tree.issymmetric();
        
        if(res== true) {
        	System.out.println("This is a Symmetric Tree");
        }
        else {
        	System.out.println("This is not a Symmetric Tree");
        }

	}

}
