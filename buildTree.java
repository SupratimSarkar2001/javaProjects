
class Node{
	int data;
	Node left;
	Node right;
	public Node(int d) {
		data=d;
		left= right= null;
	}
}

public class buildTree {
	
	int search(int[] inorder,int start,int end,int curr) {
		for(int i=start;i<=end;i++) {
		if(curr==inorder[i]) {
			return i;
		}
		}
		return -1;
	}
    static int index=0;
    Node build(int[] preorder ,int[] inorder,int start,int end) {
    	
    	if(start>end) {
    		return null;
    	}
    	
    	int curr= preorder[index];
    	index++;
    	Node root=new Node(curr);
    	
    	if(start==end) {
    		return root;
    	}
    	
    	int pos=search(inorder,start,end,curr);
    	
    	root.left=build(preorder,inorder,start,pos-1);
    	root.right=build(preorder,inorder,pos+1,end);
    	
    	return root;
    	
    	
    }
    void Inorder(Node root){
        if(root ==null){
            return;
        }
        else{
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in1[] = { 4, 2, 5, 1, 3, 6 };
	    int pre[] = { 1, 2, 4, 5, 3, 6 };
	    int n = in1.length;
	    buildTree tree= new buildTree();
	    Node k=tree.build(pre, in1, 0, n-1);
        tree.Inorder(k);
	    
	    

	}

}