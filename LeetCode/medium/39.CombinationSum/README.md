# 39. Combination Sum

Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

**Note:**

- All numbers (including target) will be positive integers.
- The solution set must not contain duplicate combinations.

For example, given candidate set `[2, 3, 6, 7]` and target `7`, 
A solution set is: 

	[
	  [7],
	  [2, 2, 3]
	]

# Solution

>解决办法仍然是递归的思路，但是有一个问题，不能出现重复集合。<br>
>思考：如何不出现重复集合，当循环到当前节点时，将当前结点的索引传至下一个递归，使得下一个递归函数以当前结点为起始，那么将不会索引当前结点的之前节点，也就避免了重复元素。