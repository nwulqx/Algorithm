# 110. Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

# Solution

>要解出来并不难，基本思路，遍历二叉树，递归算出每一个节点的左右子树高度，比较高度，不满足平衡二叉树，返回false；

**难点是优化！**

# Optimized

虽然接出来了，但是他的时间复杂度太高了。<br>
因为需要计算高度从1-n，所以O(n2)。

所以，一旦某一结点不满足平衡二叉树，则整个二叉树不需要判断。