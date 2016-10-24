# 257. Binary Tree Paths

Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

	   1
	 /   \
	2     3
	 \
	  5

All root-to-leaf paths are:

	["1->2->5", "1->3"]

# Solution

## 递归法

需要借助另一个函数，用于字符串的拼接。

## 非递归法

使用队列，但是需要借助另一个栈来存储字符串的拼接。
