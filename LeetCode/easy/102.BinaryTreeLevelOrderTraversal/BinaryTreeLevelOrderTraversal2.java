/*We can also solve this problem by stack and queue!
Beats: 36.62%;
*/
public class BinaryTreeLevelOrderTraversal2{
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root==null) return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int i = 1;
		while(!queue.isEmpty()){
			List<Integer> level = new ArrayList<Integer>();
			int j = 0;
			while(i!=0){
				TreeNode node = queue.poll();
				level.add(node.val);
				if(node.left!=null){
					queue.add(node.left);
					j++;
				}
				if(node.right!=null){
					queue.add(node.right);
					j++;
				}
				i--;
			}
			i = j;
			list.add(level);
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