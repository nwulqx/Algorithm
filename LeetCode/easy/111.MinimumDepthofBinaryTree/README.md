# 111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

# Solution

>没什么难度，递归解决就可以了！

## Attention

	 return (leftDepth == 0 || rightDepth == 0)?
		leftDepth+rightDepth+1:Math.min(rightDepth,leftDepth)+1;

注意返回值，如果一个节点只存在一个左或者右节点，那么不这么写的话，会返回空节点的深度。

		   1
		  /
		 2
		/
	   3

对于这样的树，可能会返回深度1，因为右子树深度为0。