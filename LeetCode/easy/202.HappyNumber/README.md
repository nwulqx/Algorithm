# 202. Happy Number

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

**Example**: 19 is a happy number

	12 + 92 = 82
	82 + 22 = 68
	62 + 82 = 100
	12 + 02 + 02 = 1


# Solution

## HashSet方法（2%）
>使用HashSet集合验证循环性

# Floyd判圈算法（87%）

>初始状态下，假设已知某个起点节点为节点S。现设两个指针t和h，将它们均指向S。

>接着，同时让t和h往前推进，但是二者的速度不同：t每前进1步，h前进2步。只要二者都可以前进而且没有相遇，就如此保持二者的推进。当h无法前进，即到达某个没有后继的节点时，就可以确定从S出发不会遇到环。反之当t与h再次相遇时，就可以确定从S出发一定会进入某个环，设其为环C。

>如果确定了存在某个环，就可以求此环的起点与长度。

https://zh.wikipedia.org/wiki/Floyd%E5%88%A4%E5%9C%88%E7%AE%97%E6%B3%95