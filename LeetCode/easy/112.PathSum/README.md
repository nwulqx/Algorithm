# 112. Path Sum

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

**For example:**<br>
Given the below binary tree and `sum = 22`,

	              5
	             / \
	            4   8
	           /   / \
	          11  13  4
	         /  \      \
	        7    2      1

return true, as there exist a root-to-leaf path `5->4->11->2` which sum is 22.

# Solution

## Attention

需要注意，需要计算的是一条路径上元素的和，而不是某段的和，所以和目标的比较应该是在叶子节点上进行。

而且没必要考虑空节点。

1. 是否是叶节点的判断。
2. 是否有左右节点，决定是否进行递归。