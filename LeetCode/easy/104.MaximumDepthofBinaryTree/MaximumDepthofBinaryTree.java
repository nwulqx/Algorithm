/*Using recursion*/
public class MaximumDepthofBinaryTree{
	public static void main(String []args){

	}
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return left_depth > right_depth?left_depth+1:right_depth+1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}