# 268. Missing Number

Given an array containing n distinct numbers taken from `0, 1, 2, ..., n`, find the one that is missing from the array.

For example,
Given nums = `[0, 1, 3]` return `2`.

**Note:**<br>
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

# Solution
>计算0~n的和，计算数组的和，相减获得结果。

>使用`^异或`运算，一次遍历，即可得出缺少的结果。

		result ^= i;
		result ^= nums[i];