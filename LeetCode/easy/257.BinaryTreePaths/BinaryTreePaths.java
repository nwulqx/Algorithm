/*Using recursion!
*/
public class BinaryTreePaths{
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
       	if(root!=null) traversalTree(root,"",list);
       	return list;

    }
    public void traversalTree(TreeNode root,String path,List<String> list){
    	if(root.right==null && root.left==null) list.add(path+root.val);
    	if(root.left!=null) traversalTree(root.left,path+root.val+"->",list);
    	if(root.right!=null) traversalTree(root.right,path+root.val+"->",list);
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}