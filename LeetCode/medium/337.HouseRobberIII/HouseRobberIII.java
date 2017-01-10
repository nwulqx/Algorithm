public class HouseRobberIII{
    public int rob(TreeNode root) {
        int []res = help(root);
        return Math.max(res[0],res[1]);
    }
    public int[] help(TreeNode root){
    	if(root==null)
    		return new int[2];
		int []left = help(root.left);
		int []right = help(root.right);

    	int res[] = new int[2];
    	res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
    	res[1] = left[0] + right[0] + root.val;

    	return res;
    }
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}