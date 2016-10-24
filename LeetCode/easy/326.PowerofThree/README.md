# 326. Power of Three

Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

# Solution

## 递归

>如果是三的倍数（%3 == 0），除以3。<br/>
>继续检测是否为三的倍数，直到值为1。

## 换底公式：loga b = logc b /log c a

对数的计算转换为2或者10为底的对数计算更快捷简便。一开始以为对数的计算都有它自己的公式，结果证明思想太复杂了，所有的对数计算都可以通过这个公式间接的得到结果。

## More clecver method

>3的19次方是int中，3的最大幂次方。
>所以，只要3^19%n == 0，即说明了它是3的幂次方。