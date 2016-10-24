# 104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

# BinaryTree Operation

> http://blog.csdn.net/luckyxiaoqiang/article/details/7518888

# Solution

##思路：

1. 从下向上的思想，先得到左右子树的深度。
2. 选择左右子树中深度大的值+1作为当前深度返回上层。
3. 如果当前节点为空，应该返回0表示第0层（第0层是不存在的那一层，因为是空）

它的递归思路很重要：

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return left_depth > right_depth?left_depth+1:right_depth+1;
    }