# 40. Combination Sum II
Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

**Note:**

- All numbers (including target) will be positive integers.
- The solution set must not contain duplicate combinations.

For example, given candidate set `[10, 1, 2, 7, 6, 1, 5]` and target `8`, 

A solution set is: 

	[
	  [1, 7],
	  [1, 2, 5],
	  [2, 6],
	  [1, 1, 6]
	]

# Solution

这个和 Combination Sum不同的是，对于重复的集合需要做去重处理。

	if(i>start && candidates[i] == candidates[i-1])

这个判断很重要，直接决定了是否跳过重复的项，应该判断i>start而不是i>0；

`i>start`可以解决当前层的重复，但是对于下一层的重复，应该是不做判断的。

例如:[1,1,1,1,2]

目标:2，那么[1,1]是出现一次的，因为，里面的每一个`1`都是每一层（深度遍历）中的元素；由于在第一次递归就已经屏蔽了重复元素，所以，这里面的[1,1]是索引`0`和`1`的元素。而其余的两个[1,1]是不被访问的，因为第一次循环将会屏蔽索引`2`和`3`的元素。
