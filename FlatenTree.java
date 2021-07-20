class Node{
    int data;
    Node left;
    Node right;

    public Node(int d){
        data=d;
        left= right= null;
    }
}
public class FlatenTree {
    Node root;

    void Flatten( Node root){
        if(root== null ||(root.left== null && root.right== null)){
            return;
        }
        if(root.left != null){
            Flatten(root.left);

            Node temp= root.right;
            root.right= root.left;
            root.left= null;

            Node curr= root.right;
            while(curr.right!= null){
                curr=curr.right;
            }

            curr.right= temp;
        }

        Flatten(root.right);
    }
    public void inOrder(Node node)
{
     
    
    if (node == null)
        return;
 
    inOrder(node.left);
    System.out.print(node.data + " ");
    inOrder(node.right);
}
public static void main(String[] args)
   {
    FlatenTree tree = new FlatenTree();
       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(5);
       tree.root.right.left = new Node(6);
       tree.root.right.right = new Node(7);

       tree.Flatten(tree.root);
       tree.inOrder(tree.root);


   }   
}
