import java.util.Queue;
import java.util.LinkedList;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left= right= null;
    }
}

public class LeftViewOfTree {
    Node root;

    void LeftView(Node root){
        if(root== null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();

            for(int i=1;i<=n;i++){
                Node temp= q.poll();

                if(i==1){
                    System.out.println(temp.data+" ");
                }
                if(temp.left!= null){
                    q.add(temp.left);
                }
                if(temp.right!= null){
                    q.add(temp.right);
                }
            }
        }
    }
    public static void main(String args[]) {
        LeftViewOfTree tree= new LeftViewOfTree();
        tree.root= new Node(2);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);


        tree.LeftView(tree.root);

    } 


}
