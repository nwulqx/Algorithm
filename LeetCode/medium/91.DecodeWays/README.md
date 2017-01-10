# 91. Decode Ways

A message containing letters from A-Z is being encoded to numbers using the following mapping:

	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26

Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.

# Solution

思路：这要么是个数学问题，要么是用递归的思路算出所有可能性。从这两个思路出发。


`0`没有单独存在的意义。

### bottom up dp vs.top down dp 