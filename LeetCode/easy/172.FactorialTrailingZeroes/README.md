# 172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

**Note:** Your solution should be in logarithmic time complexity.

# Solution

## 直接得出

计算+取模：超时

## 计算5出现的次数

要想得到10，需要足够的2和5，在阶乘中，质因子2远多于5的个数。所以只需计算5的个数。

举例：

	25!中统计5的个数，25中有2个5，20中1个5，15中1个5，10中1个5，5中1个5，一共6个5。

但是有一个更简便的方法：25/5=5；5/5=1；那么总数为5+1=6。

这样就可以很方便的得到了5的个数。