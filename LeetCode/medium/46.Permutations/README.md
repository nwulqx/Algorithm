# 46. Permutations

Given a collection of distinct numbers, return all possible permutations.

For example,

`[1,2,3]` have the following permutations:

	[
	  [1,2,3],
	  [1,3,2],
	  [2,1,3],
	  [2,3,1],
	  [3,1,2],
	  [3,2,1]
	]

# Solution

这是一道全排列问题，一开始的思路是什么？

对于3个数的数组，全排列应该是3*2*1；递归其实是可以解决的，只要利用好swap方法来交换当前值和开头的值就可以完成3*2*1。