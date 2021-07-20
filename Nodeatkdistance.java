class Node{
    int data;
    Node left;
    Node right;

    public Node(int d){
        data=d;
        left= right=null;
    }
}


public class Nodeatkdistance {
   Node root;
    void printNode(Node root,int k){
        if(root== null || k<0){
            return;
        }
        if(k==0){
           System.out.println(root.data+" ");
           return;
        }

        printNode(root.left, k-1);
        printNode(root.right, k-1);
    }
   int nodeatk(Node root, Node target, int k){
       if(root== null){
           return -1;
       }
       if(root== target){
           printNode(root,k);
           return 0;
       }

       int dl= nodeatk(root.left, target, k);
           if(dl != -1){
               if(dl+1 ==k){
                   System.out.println(root.data+" ");
               }
               else{
                   nodeatk(root.right, target, k-dl-2);
               }

               return dl+1;
           }

        int dr= nodeatk(root.right, target, k);
           if(dr != -1){
               if(dr+1==k){
                   System.out.println(root.data+" ");
               }
               else{
                   nodeatk(root.left, target, k-dr-2);
               }

               return dr+1;
           }   
       return -1;
   }
   
   public static void main(String args[])
   {
    Nodeatkdistance tree = new Nodeatkdistance();
 
       tree.root = new Node(20);
       tree.root.left = new Node(8);
       tree.root.right = new Node(22);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(12);
       tree.root.left.right.left = new Node(10);
       tree.root.left.right.right = new Node(14);
       Node target = tree.root.left.right;
       System.out.println(tree.nodeatk(tree.root, target, 2));
      
   }
}
