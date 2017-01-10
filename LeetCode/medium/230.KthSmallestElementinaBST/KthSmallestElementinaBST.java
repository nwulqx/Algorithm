public class KthSmallestElementinaBST{
	public static List<Integer> list = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        help(root);
        int res = list.remove(k-1);
        return res;
    }
    public void help(TreeNode root){
    	if(root.left!=null)
    		help(root.left);
    	list.add(root.val);
    	if(root.right!=null)
    		help(root.right);
    }
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}