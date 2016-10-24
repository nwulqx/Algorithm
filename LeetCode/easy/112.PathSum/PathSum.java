public class PathSum{
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root==null) return false;
    	return hasPathSum(root,root.val,sum);
    }
    public boolean hasPathSum(TreeNode root, int sum ,int target){
    	if(root.left==null && root.right==null){
    		return sum==target;
    	}
    	boolean leftBool = false;
    	boolean rightBool = false;
    	if(root.left!=null) leftBool = hasPathSum(root.left,sum+root.left.val,target);
    	if(root.right!=null) rightBool = hasPathSum(root.right,sum+root.right.val,target);
    	return leftBool || rightBool;
    }
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}