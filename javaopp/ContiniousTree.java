package javaopp;

public class ContiniousTree {
	static class Node{
		int data;
		Node left;
		Node right;
	}
	static Node NewNode(int d){
		Node nd= new Node();
		nd.data=d;
		nd.left=null;
		nd.right= null;
		
		return nd;
	}
	
	static boolean IsContinious(Node root) {
		if(root == null) {
			return true;
		}
		if(root.left== null && root.right == null) {
			return true;
		}
		if(root.left== null) {
			return (Math.abs(root.right.data- root.data)== 1) && IsContinious(root.right);
		}
		if(root.right == null) {
			return (Math.abs(root.left.data- root.data)== 1) && IsContinious(root.left);
		}
		
		return (Math.abs(root.right.data- root.data)== 1) && IsContinious(root.right) && (Math.abs(root.left.data- root.data)== 1) && IsContinious(root.left);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// making a treee;
	    Node root = NewNode(3);
	    root.left     = NewNode(2);
	    root.right     = NewNode(4);
	    root.left.left = NewNode(1);
	    root.left.right = NewNode(3);
	    root.right.right = NewNode(5);
	    
	    if(IsContinious(root)) {
	    	System.out.println("yes");
	    }
	    else {
	    	System.out.println("no");
	    }

	}

}
