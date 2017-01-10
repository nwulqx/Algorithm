# 216. Combination Sum III

Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


***Example 1:***

Input: **k** = 3, **n** = 7

Output:

	[[1,2,4]]

***Example 2:***

Input: **k** = 3, **n** = 9

Output:

	[[1,2,6], [1,3,5], [2,3,4]]

# Solution

在做这道题之前，请一定要做Combination Sum的前两道题目，前两道题目解决了递归查找和递归不重复查找以及他的Boundary Check。

那么这道题其实就好解决了，这道题目限制了递归的深度，那么在Combination SumII的基础上再加上一个深度参数，在边界检测时同时也需要判断深度是否已经超过限制的深度即可。