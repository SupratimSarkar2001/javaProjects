class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left=right= null;
    }
}
public class FindLcaUsingRecursion {
    Node root;
    Node findLca(Node node ,int n1,int n2){

        if(node  == null){
            return null;
        }
        if(node .data== n1 || node .data== n2 ){
            return node ;
        }
        Node leftLca= findLca(node.left,n1,n2);

        Node rightLca= findLca(node.right,n1,n2);

        if(leftLca != null && rightLca != null){  
            return node;                     
        }

        else if(leftLca != null){
            return node .left;
        }
        return node .right;
        
    }
    public static void main(String[] args)
    {
        FindLcaUsingRecursion tree = new FindLcaUsingRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
 
        System.out.println("LCA(4, 5): " + tree.findLca(tree.root,4,5).data);
        System.out.println("LCA(4, 6): " + tree.findLca(tree.root,4,6).data);
        System.out.println("LCA(3, 4): " + tree.findLca(tree.root,3,4).data);
        System.out.println("LCA(2, 4): " + tree.findLca(tree.root,2,4).data);
     
    }
    
}
