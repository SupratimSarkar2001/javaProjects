package projects2;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int d) {
		data=d;
		left=right= null;
	}
}
public class IdenticalTrees {
	Node root1;
	Node root2;
	boolean isIndentical(Node root1, Node root2) {
		if(root1== null && root2== null) {
			return true;
		}
		if(root1== null && root2 != null) {
			return false;
		}
		if(root1 != null && root2== null)
		{
			return false;
		}
		if(root1.data== root2.data) {
			return isIndentical(root1.left,root2.left) && isIndentical(root1.right,root2.right);
		}
		return false;
		
	}
	public static void main(String[] args) {
	  IdenticalTrees tree = new IdenticalTrees();
	  tree.root1=new Node(5);
	  tree.root1.left= new Node(6);
	  tree.root1.right= new Node(7);
	  tree.root1.left.left= new Node(8);
	  
	  
	  tree.root2=new Node(5);
	  tree.root2.left= new Node(6);
	  tree.root2.right= new Node(7);
	  tree.root2.left.left= new Node(8);
	  if(tree.isIndentical(tree.root1, tree.root2)) {
		  System.out.println("is identiacal");
	  }
	  else {
		  System.out.println("is Not identical");
	  }
	}
}
