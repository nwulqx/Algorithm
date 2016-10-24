# 136. Single Number
Given an array of integers, every element appears twice except for one. Find that single one.

**Note:**
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Subscribe to see which companies asked this question

#Solution

如何置两个相等的数为0，最简单的方法是使用符号XOR（异或`^`），那么这道题，遍历数组，并使用一个变量异或存储所有，最后剩下的就是出现一次的了。