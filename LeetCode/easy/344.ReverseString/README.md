# 344. Reverse String

Write a function that takes a string as input and returns the string reversed.

**Example:**

Given s = "hello", return "olleh".

# Solution
使用异或`^`可以简化交换，但是注意不能**交换索引相同的数组**。<br/>
只需要O(n/2)的时间复杂度。