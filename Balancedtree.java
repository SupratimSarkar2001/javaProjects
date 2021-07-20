class Node{
    int data;
    Node left,right;

    public Node(int d){
        data=d;
        left=right= null;
    }
}


public class Balancedtree {
    Node root;
    int height(Node n){
        if(n== null){
            return 0;
        }
        int lh=height(n.left);
        int rh=height(n.right);

        return Math.max(lh,rh)+1;
    }
    boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
        int lh=height(root.left);
        int rh=height(root.right);

        if(isBalanced(root.left)== false || isBalanced(root.right)== false){
            return false;
        }
        else if(Math.abs(lh-rh)<=1){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]) {
        Balancedtree tree= new Balancedtree();
        tree.root= new Node(2);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        if(tree.isBalanced(tree.root)){
            System.out.println("balanced");
        }
        else{
            System.out.println("unbalanced");
        }

    }   
}
