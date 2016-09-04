#Palindrome Number（回文数）

Determine whether an integer is a palindrome. Do this without extra space.

##简单的字符串比较

>借助StringBuffer函数的reverse()方法，可以轻松的对字符串反转，在对翻转后的数字和原数字比较，相等则为回文数。

###出现的问题：

>数字越界问题，通过stringbuffer转换后，可能出现按数字超越了int数字的界限。

这样做的时间复杂度和空间复杂度是很浪费的，一个字符是占8位，10位数将占到80位，大于int的32位。

##直接操作int

>使用取模操作直接操作int数字，并且只需要循环数字长度的一半，保证两半数字大小相等，即数字就是回文数