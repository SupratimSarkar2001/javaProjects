class Node{
   int data;
   Node left;
   Node right;
   public Node(int d){
       data=d;
       left=right= null;
   }
}


public class buildTree2 {
    static int index=7;
    Node maketree(int[] in , int[] pos, int start,int end){

        if(start>end){
            return null;
        }
        int curr=pos[index];
        index--;
        Node root = new Node(curr);
        if(start== end){
            return root;
        }

        int position=search(in,start,end,curr);

        
        root.right= maketree(in,pos,position+1,end);
        root.left=maketree(in,pos,start,position-1);

        return root;


    }


    int search(int[] in ,int start,int end,int key) {
        int i;
        for(i=start;i<end;i++){
            if(in[i]==key){
                break;
            }
        }
        return i;
        
    }
    void preOrder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }




    public static void main(String[] args){

        buildTree2 tree= new buildTree2();
        int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };

        int n= in.length;

        Node root = tree.maketree(in,post,0,n-1);
        System.out.println(
            "Preorder of the constructed tree : ");
        tree.preOrder(root);    
    }        
    
}
