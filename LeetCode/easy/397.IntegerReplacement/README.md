# 397. Integer Replacement

Given a positive integer n and you can do operations as follow:

1. If n is even, replace n with `n/2`.
2. If n is odd, you can replace n with either `n + 1` or `n - 1`.
What is the minimum number of replacements needed for n to become 1?

**Example 1:**

	Input:
	8
	
	Output:
	3
	
	Explanation:
	8 -> 4 -> 2 -> 1

**Example 2:**

	Input:
	7
	
	Output:
	4
	
	Explanation:
	7 -> 8 -> 4 -> 2 -> 1
	or
	7 -> 6 -> 3 -> 2 -> 1

# Solution

## 递归实现

>java.lang.StackOverflowError when n = 2147483647

出现了栈溢出问题，说明递归虽然可以解决，但是对于深度大的递归，会发生栈溢出。

## 非递归实现

使用循环，但是，对于需要加1或者减1的数字，如何判断？

**这里给出了一个很好的分析：**

对于 `1111`，有两种情况可以解决：

1. 加1，构成`10000`，右移4位，共需要5步。
2. 减1，构成`1110`；右移一位，`111`；继续减1，构成`110`；右移1位，构成`11`；`11`减1，`10`；右移1位，共需6步。

但是，这其中有一个特殊数字，但很幸运，它可能也是唯一的特殊数。当为`11`时，加1 + 移位，不如减1 + 移位的步数少。

所以这道题的判断变成了：

1. 结尾为`11`且整个数不为`11`，那么就 `+1` + 移位。
2. 结尾为`01`或者整个数为`11`，那么就`-1` + 移位。
3. 结尾为`01`，移位。
