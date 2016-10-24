public class MinimumDepthofBinaryTree{
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        /*this sentence is very much useful!*/
        return (leftDepth == 0 || rightDepth == 0)?leftDepth+rightDepth+1:Math.min(rightDepth,leftDepth)+1;
    }

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}