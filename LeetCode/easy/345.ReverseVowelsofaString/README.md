# 345. Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

**Example 1:**

Given s = "hello", return "holle".

**Example 2:**

Given s = "leetcode", return "leotcede".

**Note:**

The vowels does not include the letter "y".

# Solution

## 双指针

前后双指针同时遍历字符串。同时遇到元音则交换。