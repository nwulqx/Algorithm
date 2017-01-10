public class BinaryTreePreorderTraversal{
	private List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        travel(root);
        return list;
    }
    public void travel(TreeNode node){
    	if(node == null) return;
    	list.add(node.val);
    	travel(node.left);
    	travel(node.right);
    }
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}