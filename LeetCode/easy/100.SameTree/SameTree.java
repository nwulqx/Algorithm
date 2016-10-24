public class SameTree{
	public static void main(String []args){

	}
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null && q==null) return true;
    	else if((p==null && q!=null) ||(p!=null && q==null))  return false;
        boolean right = isSameTree(p.right,q.right);
        boolean left = isSameTree(p.left,q.left);
        return right&&left&&(p.val==q.val);
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}