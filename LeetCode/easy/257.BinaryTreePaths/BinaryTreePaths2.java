public class BinaryTreePaths2{
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		if(root==null) return list;
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<String> q2 = new LinkedList<String>();
		q1.add(root);
		q2.add(root.val+"");
		while(!q1.isEmpty()){
			TreeNode node = q1.poll();
			String path = null;
			if(node.left==null && node.right==null){
			 list.add(q2.poll());
			 continue;
			}
			path = q2.poll();
			if(node.left!=null){
				q1.add(node.left);
				q2.add(path+"->"+node.left.val);
			}
			if(node.right!=null){
				q1.add(node.right);
				q2.add(path+"->"+node.right.val);
			}
		}
		return list;
	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}