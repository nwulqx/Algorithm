public class BinaryTreeInorderTraversal{
	private List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        travel(root);
        return list;
    }
    public void travel(TreeNode node){
    	if(node==null) return;
    	travel(node.left);
    	list.add(node.val);
    	travel(node.right);
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}