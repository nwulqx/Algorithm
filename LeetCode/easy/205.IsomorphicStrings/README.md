# 205. Isomorphic Strings

Given two strings **s** and **t**, determine if they are isomorphic.

Two strings are isomorphic if the characters in **s** can be replaced to get **t**.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

**For example**

Given `"egg"`, `"add"`, return true.

Given `"foo"`, `"bar"`, return false.

Given `"paper"`, `"title"`, return true.

Note:
You may assume both **s** and **t** have the same length.

# Solution

## HashMap判断

借助Map.put()方法的特点，如果key值相同，则返回当前对应的值，并更新值。

## 优化，使用数组

使用集合框架的复杂度可能会比较大，字符一共256种。

### Attention

需要利用索引`i`去判断，如果只是单纯的判断出现次数。则可能出现问题：

	"a,b,a","b,a,a"

应该根据索引来判断，而不是单纯的自字符出现的次数！而且为了避免`0`索引，应该在索引值上加1。