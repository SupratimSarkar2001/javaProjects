package project1;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int d) {
		data=d;
		left= right= null;
		
	}
}

public class BST {
	  Node root;
	
	void insert(int k) {
		root= makeInsert(root,k);
	}
    Node makeInsert(Node root,int k) {
    	if(root== null) {
    		return new Node(k);
    	}
    	if(root.data>k) {
    		root.left= makeInsert(root.left,k);
    	}
    	root.right=makeInsert(root.right,k);
    	
    	return root;
    }
    Node Search(Node root, int k) {
    	if( root== null) {
    	
    		return null;
    	}
    	if( root.data==k) {
    		
    		return root;
    	}
    	if(k> root.data) {
    	 return  Search(root.right,k);
    	
    	}
    	else {
    	return Search(root.left,k);
    	}


    
    }
    
    void Inorder(Node root) {
    	if(root== null) {
    		return ;
    	}
    	 Inorder(root.left);
    	 System.out.print(root.data+" ");
    	 Inorder(root.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST b= new BST();
		b.insert(1);
		b.insert(2);
		b.insert(3);
		b.insert(4);
		b.insert(5);
		
		b.Inorder(b.root);
      Node temp= b.Search(b.root, 3);
      System.out.println();
      b.Inorder(temp);
	}

}
