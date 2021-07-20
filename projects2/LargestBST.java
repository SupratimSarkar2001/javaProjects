package projects2;
class Node{
	int data;
	Node left,right;
	public Node(int d) {
		data=d;
		left=right= null;
	}
}

public class LargestBST {
	int max= Integer.MAX_VALUE;
	int min=Integer.MIN_VALUE;
	boolean isBST(Node root,int max, int min) {
		if(root== null) {
			return true;
		}
		
		if(root.left == null && root.right == null) {
			return true;
		}
		if(root.data<min || root.data>max) {
			return false;
		}// this on eis the main line of the is bst function if the adta of the root is greater than the maximum value(for left subtree it cant be max then its root or min then the vakllue in right subtree it cant be minimun thenj the value of uts root vbalur;
		
		return isBST(root.left, min,root.data) && isBST(root.right, root.data,max); 
	}
	
	int findSize( Node root) {
		if(root== null) {
			return 0;
		}
		
		return findSize(root.left)+findSize(root.right)+1;
	}
	
    int findLargest(Node root) {
    	if(isBST(root,max,min)) {
    	return	findSize(root);
    	}
    	
    	return Math.max(findLargest(root.left),findLargest(root.right));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	LargestBST tree = new LargestBST();
    	
		Node root = new Node(10);
		 
        root.left = new Node(15);
        root.right = new Node(8);
 
        root.left.left = new Node(12);
        root.left.right = new Node(20);
 
        root.right.left = new Node(5);
        root.right.right = new Node(2);
        
        System.out.println("the size of the laargest BST is :"+tree.findLargest(root));

	}

}
