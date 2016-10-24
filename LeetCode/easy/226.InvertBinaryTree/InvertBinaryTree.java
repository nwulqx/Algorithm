public class InvertBinaryTree{
	public static void main(String []args){

	}
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode rightNode = invertTree(root.right);
        TreeNode leftNode = invertTree(root.left);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        return root;
    }
}
	
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}