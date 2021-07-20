class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left=right= null;
    }
}
class Res {
    public int val;
}

public class MaxPathSum {
    Node root;



    int findMaxhelp(Node root, Res ans){
            if(root== null){
                return 0;
}
            int l= findMaxhelp(root.left,ans);
            int r= findMaxhelp(root.right,ans);

            int Max_val=Math.max(Math.max(root.data, root.data+l+r),Math.max(l,r));

            ans.val= Math.max(Max_val,ans.val);

            int Single_max_path= Math.max(root.data,Math.max(l,r));

            return Single_max_path;
}
    int findMaxSum(Node root){
        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        findMaxhelp(root,res);

        return res.val;
    }

    public static void main(String args[]) {
        MaxPathSum tree = new MaxPathSum();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
        System.out.println("maximum path sum is : " +
                            tree.findMaxSum(tree.root));
    }
}
