class Node{
    int data;
    Node left;
    Node right;

    public Node(int d){
        data=d;
        left= right= null;
    }
}

public class FindDistance {
    Node root;
    
    Node FindLCA(Node root, int n1,int n2){
        if( root == null){
            return null;
        }

        if( root.data== n1 || root.data== n2){
            return root;
        }

        Node left_lca= FindLCA(root.left,n1,n2);
        Node right_lca= FindLCA(root.right,n1,n2);

        if(left_lca != null && right_lca != null){

              return root;
        }

        if(left_lca != null){
            return root.left;
        }
        return root.right;
    }
    int findlevel(Node root,int key, int level){
        if(root== null){
            return -1;
        }
        if(root.data==key){
            return level;
        }

       int left= findlevel(root.left, key, level+1);
       if(left==-1){
        return findLevel(root.right, key, level + 1);
       }

      return left; 
    }

   int findDistance(Node root, int n1,int n2){
       Node lca=FindLCA(root, n1, n2);
       int d1=findlevel(lca,n1,0);
       int d2= findlevel(lca ,n2,0);


       return d1+d2;
   }
   public static void main(String[] args)
   {
    FindDistance tree = new FindDistance();
       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(5);
       tree.root.right.left = new Node(6);
       tree.root.right.right = new Node(7);

       System.out.println("LCA(4, 5): " + tree.findDistance(tree.root,4,5));
       System.out.println("LCA(4, 6): " + tree.findDistance(tree.root,4,6));
       System.out.println("LCA(3, 4): " + tree.findDistance(tree.root,3,4));
       System.out.println("LCA(2, 4): " + tree.findDistance(tree.root,2,4));
    
   }

}