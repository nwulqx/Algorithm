/*Betas 88.5%
*/
public class BinaryTreeLevelOrderTraversal{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        traversalByLevel(root,list,1);
        return list;
    }
    public void traversalByLevel(TreeNode root,List<List<Integer>> list,int level){
        if(root==null) return;
        if(list.size()<level) list.add(new ArrayList<Integer>());
        list.get(level-1).add(root.val);
        traversalByLevel(root.left,list,level+1);
        traversalByLevel(root.right,list,level+1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}