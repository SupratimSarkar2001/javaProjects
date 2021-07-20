class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class MakingBST {
    Node root;
 
    MakingBST()
    {
         root = null;
    }

    Node insert(Node root, int k) {
        if (root == null) {
            root= new Node(k);
            return root;
        }
        if(k<root.data){
            root.left=insert(root.left,k);
        }else{
            root.right= insert(root.right,k);
        }
        return root;
    }

    void inorder(Node root){
        if(root== null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        MakingBST tree = new MakingBST();
        tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        tree.inorder(tree.root);
    }
}
