# 404. Sum of Left Leaves

Find the sum of all left leaves in a given binary tree.

**Example:**

	    3
	   / \
	  9  20
	    /  \
	   15   7

	There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

# Solution

## 递归解决recursion

>首先，我们需要知道，如何判断是一个左叶子节点：不为空，没有子节点。<br>
>其次，如果为左叶子节点那么返回值：左节点的值+递归（右节点）。<br>
>最后，如果，它的左节点不是叶子节点，应该返回Recursion（左节点）+Recursion（右节点）。<br>

