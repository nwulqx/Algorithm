/*
	Your runtime beats 13.92% of java submissions.
*/
public class LowestCommonAncestorofaBinarySearchTree{
	public TreeeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
		if(root == p || root ==q){
			return root;
		}
		if(find(root.left,p)){
			if(find(root.right,q)){
				return root;
			}else{
				return lowestCommonAncestor(root.left,p,q);
			}
		}else{
			if(find(root.left,q)){
				return root;
			}else{
				return lowestCommonAncestor(root.right,p,q);
			}
		}
	}
	public static boolean find(TreeNode root,TreeNode node){
		if(root==null || node==null){
			return false;
		}
		if(root==node){
			return true;
		}
		boolean found = find(root.left,node);
		if(!found){
			found = find(root.right,node);
		}
		return found;
	}
}
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val=x;}
}