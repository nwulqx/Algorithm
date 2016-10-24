# 303. Range Sum Query - Immutable

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

**Example:**
	
	Given nums = [-2, 0, 3, -5, 2, -1]
	
	sumRange(0, 2) -> 1
	sumRange(2, 5) -> -1
	sumRange(0, 5) -> -3

**Note:**

1. You may assume that the array does not change.
2. There are many calls to sumRange function.

# Solution

## Attention

注意题目需求，需要多次调用求和函数。

## 改变存入结构

可以直接存储0~n的和到数组中。

用的时候使用减法求出所求区间的和。