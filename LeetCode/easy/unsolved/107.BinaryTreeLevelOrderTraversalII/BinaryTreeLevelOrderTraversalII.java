import java.util.*;
/*A very inefficient method!
Your runtime beats 1.51% of java submissions
*/
public class BinaryTreeLevelOrderTraversalII{
	public static void main(String []args){

	}
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null) return list;
        List<TreeNode> arrnode = new ArrayList<TreeNode>();
        arrnode.add(root);
        while(!arrnode.isEmpty()){
        	List<Integer> result = findNode(arrnode);
        	System.out.println(Arrays.toString(result.toArray()));
        	if(!result.isEmpty()){
        		list.add(result);
        	}
        	List<TreeNode> arrnode2 = new ArrayList<TreeNode>();
        	while(!arrnode.isEmpty()){
        		TreeNode node = arrnode.remove(0);
        		if(node.left!=null){
        			arrnode2.add(node.left);
        		}
        		if(node.right!=null){
        			arrnode2.add(node.right);
        		}
        	}
        	arrnode = arrnode2;
        }
        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        for(int i=list.size()-1;i>=0;i--){
        	list2.add(list.get(i));
        }
        return list2;
    }
    public static List<Integer> findNode(List<TreeNode> list){
    	List<Integer> result = new ArrayList<Integer>();
    	int k = 0;
    	while(k<list.size()){
    		TreeNode node = list.get(k++);
    		if(node!=null){
    			result.add(node.val);
    		}
    	}
    	return result;
    }
    public static void reverseList(List<List<Integer>> list){

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}