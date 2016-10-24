# 258. Add Digits

Given a non-negative integer `num`, repeatedly add all its digits until the result has only one digit.

For example:

Given `num = 38`, the process is like: `3 + 8 = 11`, `1 + 1 = 2`. Since `2` has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

#Solution

研究发现，所有的除了9的倍数的数，他们模9后的值，就是所求的数了。

## 树根（<a href="https://zh.wikipedia.org/wiki/%E6%95%B8%E6%A0%B9">参考</a>）


>数根是将一正整数的各个位数相加（即横向相加），若加完后的值大于10的话，则继续将各位数进行横向相加直到其值小于十为止[1]，或是，将一数字重复做数字和，直到其值小于十为止，则所得的值为该数的数根。



## 同余（<a href="https://zh.wikipedia.org/wiki/%E5%90%8C%E9%A4%98">参考</a>）

>当两个整数除以同一个正整数，若得相同余数，则二整数同余。

两个整数 a，b，若它们除以正整数m所得的余数相等，则称 a，b对于模m同余。<br>
记作：a≡b (mod m)