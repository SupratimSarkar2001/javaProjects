import java.util.concurrent.atomic.AtomicInteger;
class Node{
  int data;
  Node left,right;
  public Node(int d){
    data=d;
    left=right= null;
  }
}

public class Main{
    
  void inorder(Node root){
    if(root== null){
      return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }

  Node BuildTreeUtil(int[] preorder,AtomicInteger pIndex,int min ,int max){
    if(pIndex.get() >= preorder.length){
      return null;
    }
    int val=preorder[pIndex.get()];
    if(val>max || val<min){
      return null;
    }
    Node root= new Node(val);

    pIndex.incrementAndGet();

    root.left= BuildTreeUtil(preorder, pIndex,min,val);

    root.right=BuildTreeUtil(preorder, pIndex,val,max);

    return root;
  }

  Node BuildTree(int[] preorder){
    AtomicInteger pIndex = new AtomicInteger(0);
    return BuildTreeUtil(preorder,pIndex,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
  public static void mian(String args[]){

    Main tree= new Main();
    int[] preorder = { 15, 10, 8, 12, 20, 16, 25 };
    Node root= tree.BuildTree(preorder);

    tree.inorder(root);
  }
}