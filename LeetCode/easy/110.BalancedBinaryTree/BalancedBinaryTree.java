/*My solution!
beats: 22.5%;
*/
public class BalancedBinaryTree{
    public static boolean isBalanced(TreeNode root) {
    	if(root==null) return true;
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        if(Math.abs(leftDepth-rightDepth)<=1){
            //Because 1+2+3+4+……+n,Time complicity is O(n2).
        	return isBalanced(root.left) && isBalanced(root.right);

        }
        return false;
    }
    public static int getDepth(TreeNode root){
    	if(root==null) return 0;
    	int leftDepth = getDepth(root.left);
    	int rightDepth = getDepth(root.right);
    	return leftDepth>rightDepth?leftDepth+1:rightDepth+1;
    }
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}