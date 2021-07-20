package javaopp;


class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left= right= null;
		}
	}
public class FoldableTree {
	Node root;
	boolean isFoldable(Node root) {
		boolean res;
		if(root == null) {
			return true;
		}
		else {
			mirror(root.left);
			res= isSamestruct(root.left,root.right);
			mirror(root.left);
			
			return res;
		}
	}
	
	boolean isSamestruct(Node a,Node b) {
		if(a== null && b== null) {
			return true;
		}
		
		if(a!= null && b!= null && isSamestruct(a.left,b.left) && isSamestruct(a.right,b.right)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void mirror(Node root) {
		if(root == null) {
			return;
		}
		else {
			Node temp;
			mirror(root.left);
			mirror(root.right);
			
			temp= root.left;
			root.left= root.right;
			root.right= temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoldableTree tree = new FoldableTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        
        if (tree.isFoldable(tree.root))
            System.out.println("tree is foldable");
        else
            System.out.println("Tree is not foldable");

	}

}
