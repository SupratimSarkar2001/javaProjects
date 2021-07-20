import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left= right= null;
    }
}


public class levelOrderTraversal {

    Node root;
    void printLevelOrder(){
        if(root== null){
            return;
        }
        Queue<Node> queue= new LinkedList<Node>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node temp= queue.poll();
            if(temp != null){
                System.out.print(temp.data+" ");

                if(temp.left  != null){
                    queue.add(temp.left);
                }

                if(temp.right != null){
                    queue.add(temp.right);
                }
            
            }
            else if(!queue.isEmpty()){
                queue.add(null);
            }
        }
        
    }

    public static void main(String args[]){
        levelOrderTraversal tree_level= new levelOrderTraversal();
       
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
    
}
