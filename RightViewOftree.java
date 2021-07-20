import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
     Node left;
     Node right;
     public Node(int d){
         data=d;
         left=right= null;
     }
}


public class RightViewOftree {
    Node root;

    void RightView(Node root){
        if(root== null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n= q.size();
            for( int i=1;i<=n;i++){
                Node curr= q.poll();

                if( i== n){
                    System.out.print(curr.data+" ");
                }

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String args[]) {
        RightViewOftree tree= new RightViewOftree();
        tree.root= new Node(2);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);


        tree.RightView(tree.root);

    } 
}
