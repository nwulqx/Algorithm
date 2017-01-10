/*Using two static int nums;
*/
public class KthSmallestElementinaBST2{
	public static int count = 0;
	public static int result = 0;
	public int kthSmallest(TreeNode root, int k) {
		count = k;
		help(root);
		return result;
	}
	public void help(TreeNode root){
		if(root.left!=null)
			help(root.left);
		count--;
		if(count==0){
			result = root.val;
			return;
		}
		if(root.right!=null)
			help(root.right);
	}
}