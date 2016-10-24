# 387. First Unique Character in a String
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

**Examples:**

	s = "leetcode"
	return 0.
	
	s = "loveleetcode",
	return 2.

**Note:** You may assume the string contain only lowercase letters.

# Solution

>第一反应查相同，HashMap可查重。

>但是这种题目需要考虑性能，HashMap性能一般，因为它是一种数据结构了，可以考虑数组，只要在可控范围内，数组的效率高于Map集合，很显然，这题数组也可以做，效率更高！

## Boundary Check

1. 字符串长度为1，应该返回0，因为只有一一个字符，不存在重复。
2. 字符长度为0，返回-1。
