# 101. Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree `[1,2,2,3,4,4,3]` is symmetric:

	    1
	   / \
	  2   2
	 / \ / \
	3  4 4  3

But the following `[1,2,2,null,3,null,3]` is not:

	    1
	   / \
	  2   2
	   \   \
	   3    3
# Solution

>这种树的问题一般两种思路：递归和非递归。<br>

## 递归法

使用递归来解决，注意树的比较，是左子树的右节点和右子树的左节点比较，这样才是对称的。

## 非递归法

使用栈或者队列来解决，麻烦但是不难，递归难理解，但是简单。