# 168. Excel Sheet Column Title

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

	    1 -> A
	    2 -> B
	    3 -> C
	    ...
	    26 -> Z
	    27 -> AA
	    28 -> AB 

## Solution

>难点在于怎么取模，怎么循环，如果懂了的话，很简单！

>观察发现，n是从1开始的，但是，我们操作的话，从0开始更简单，不用操作进位或者改变模值了。所以第一步需要n-1。

>那么存在的问题，比如进位问题，以及模值问题都可以解决了！