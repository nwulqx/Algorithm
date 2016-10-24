/*Using recursion solve this problem !
beats 23%.
*/
public class SymmetricTree{
    public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isEqual(root.right,root.left);
    }
    public static boolean isEqual(TreeNode right,TreeNode left) {
    	if(right == null && left == null){
    		return true;
    	}
        if(right == null || left == null){
            return false;
        }
        if(right.val != left.val){
        	return false;
        }
        return isEqual(right.right,left.left) && isEqual(right.left,left.right);
    }
}

class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int x) { val = x; }
}