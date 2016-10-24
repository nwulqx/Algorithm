/*Optimised this method!
beats:70%;
*/
public class BalancedBinaryTree2{
	public static boolean isBalanced(TreeNode root) {
		return getDepth(root)!=-1;
	}
    public static int getDepth(TreeNode root){
    	if(root==null) return 0;
    	int leftDepth = getDepth(root.left);
    	if(leftDepth==-1) return -1;
    	int rightDepth = getDepth(root.right);
    	if(rightDepth==-1) return -1;
    	if(Math.abs(leftDepth-rightDepth)>1) return -1;

    	return leftDepth>rightDepth?leftDepth+1:rightDepth+1;
    }
}