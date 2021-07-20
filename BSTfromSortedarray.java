class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left= right= null;
    }
}


public class BSTfromSortedarray {
    Node root;
    Node MakeBst(int[] arr, int start, int end){
       if(start>end){
           return null;
       }
       
       
       
        int mid=(start+end)/2;
       Node n= new Node( arr[mid]);

       n.left= MakeBst(arr, start, mid-1);
       n.right=MakeBst(arr, mid+1, end);

       return n;
       
    }

    void inorder(Node root){
         if(root== null){
             return ;
         }
         inorder(root.left);
         System.out.print(root.data+" ");
         inorder(root.right);
    }
    public static void main(String args[]){
        BSTfromSortedarray tree=new BSTfromSortedarray();
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n= arr.length;
        tree.inorder( tree.MakeBst(arr,0,n-1));;
    }
}
