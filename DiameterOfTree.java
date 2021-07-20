class Node{
    int data;
    Node left;
    Node right;

    public Node(int d){
        data=d;
        left= right= null;
    }
}


public class DiameterOfTree {

    Node root;

    int height(Node node){

        if(node == null){
            return 0;
        }

       int lhe= height(node.left);
       int rhe= height(node.right);

        return Math.max(lhe,rhe)+1;
    }
    int Diameter(Node root){
        if(root== null){
            return 0;
        }

        int lheight=height(root.left);
        int rheight=height(root.right);

        int ldia=Diameter(root.left);
        int rdia= Diameter(root.right);


        return Math.max( lheight+rheight+1,Math.max(ldia,rdia));
    }
    public static void main(String args[]) {
    DiameterOfTree tree = new DiameterOfTree();

    tree.root= new Node(2);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);


    System.out.println("the diameter is :"+ tree.Diameter(tree.root));
    } 

}
