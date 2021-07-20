class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left= right= null;
    }
}

public class HeightOfTree {
    Node root;

    int FindHeight(Node root){
        if( root== null){
            return 0;
        }
        int lHight= FindHeight(root.left);
        int rHeight= FindHeight(root.right);

        return(1+Math.max(lHight, rHeight));
    }
    public static void main(String args[]) {
        HeightOfTree tree= new HeightOfTree();
        tree.root= new Node(2);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of a tree is : "+tree.FindHeight(tree.root));
    }
}
