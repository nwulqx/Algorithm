# 151. Reverse Words in a String
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Update (2015-02-12):

For C programmers: Try to solve it in-place in O(1) space.

# Solution

## 思路一：

按字符处理，遇到空白字符，则截取字符串，加入新字符串。

遇到的问题：

>当索引到0时，需要单独做判断。

## 思路二：

使用java的trim()函数删除头尾空格，然后使用正则切割数组，注意多个空格的正则表达式`\\s+`或者 `[ \\t\\n\\x0B\\f\\r]+` 的表达。

## 思路三（思路很不错，但是与想要的结果不符，错误答案）

先对每一个字符串反转，在对整个字符串进行反转。

遇到的问题，Java没法像C一样直接操作字符串的指针（注意，charAt方法只能用于获取，无法作为变量被修改！！！）。所以，应该转换为char数组。

