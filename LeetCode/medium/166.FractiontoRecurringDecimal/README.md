# 166. Fraction to Recurring Decimal

Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

For example,

- Given numerator = 1, denominator = 2, return "0.5".
- Given numerator = 2, denominator = 1, return "2".
- Given numerator = 2, denominator = 3, return "0.(6)".

# Solution

有理数除以有理数，一定得到有理数，**有理数是无限循环小数。无限不循环小数是无理数。**所以，两数相除，一定的到无限循环小数。

这题有两个地方不好解决：

1. `1/6 = 0.16666666` 如何才能在找到循环索引。
2. `1/333=0.003003003003003003003003003003`，如何当在`00`处继续执行，因为并不是结果。

对于第一个问题，应该使用集合来查重，但是对于如何找到循环的起点，思路，应该是该重复数字的上一次出现的位置。

对于第二个问题，解决办法是，不能仅以结果来判断当前是否是循环，应该以被除数的值来判断。例如：

	1/333，虽然第一位小数是 0 ，但是被除数为10，第二位小数也为0，但是被除数是100。

如果以被除数来判断，则可以解决判断是否循环的问题，而不需要担心结果中是否有重复的数字。

**犯的错**

以结果值来判断是否是循环是有误导性的。应该使用被除数判断。

## Boundary Check

这道题算是踩得坑很多的了。

上面的思路解题的关键，但是迟迟无法AC。原因在于：

1. 正负处理问题；
2. 对于`-2147483648`要被转换为long类型。

-2147483648取正，2147483648会溢出，2147483648的二进制存储和int中Integer.MIN_VALUE()的存储一样，所以会被读取为-2147483648。

应该先对-2147483648转为long类型，再进行取正操作。

>Math.abs((long)-2147483648)