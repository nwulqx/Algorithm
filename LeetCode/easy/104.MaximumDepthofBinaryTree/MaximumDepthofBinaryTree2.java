public class MaximumDepthofBinaryTree{
	public static void main(String []args){

	}
    public static int maxDepth(TreeNode root) {

    }
}

  if (pRoot == NULL)  
        {  
            return 0;  
        }  
        queue<TreeNode*> q;  
        q.push(pRoot);  
        int length = 0;  
        int level = 0;  
        while (!q.empty())//这个方法用的非常巧妙，在这里判断队是否为空，即判断下层有没有节点  
        {                 //来决定level加不加1  
            length = q.size();//用q.size()来记录同层的节点个数  
            level++;  
            while (length--)//用一个while循环把同一层的节点出队，并把它们的所有孩子入队  
            {  
                TreeNode* temp = q.front();  
                q.pop();  
                if (temp->left)  
                {  
                    q.push(temp->left);  
                }  
                if (temp->right)  
                {  
                    q.push(temp->right);  
                }  
            }  
        }  
        return level;  