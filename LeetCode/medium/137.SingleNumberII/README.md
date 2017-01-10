# 137. Single Number II

Given an array of integers, every element appears three times except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Subscribe to see which companies asked this question

# Solution

这个解法太牛了，确实想不到。

仔细想想，其实运用了一些取模的原理，当为出现3的倍数时，利用two的来把one置为0;
同理，数字出现一次时，将one置为所取得数字。
