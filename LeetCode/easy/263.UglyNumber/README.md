# 263. Ugly Number

Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include `2, 3, 5`. For example, `6, 8` are ugly while `14` is not ugly since it includes another prime factor `7`.

Note that `1` is typically treated as an ugly number.

# Solution

1. 递归法，数字太大出现stackoverflow。
2. 循环法，可以通过。
3. 更简单的循环法，因为4也就是2，所以可以直接循环2-5，去除所有2-5的倍数，如果结果为1则为true。