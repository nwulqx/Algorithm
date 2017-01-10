# Implement strStr()

Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

#Solution
>返回查找到的第一个子串。<br/>
>我用了DP的方法，结果遇到了最后一个超大字符串，内存溢出了，所以，这个方法只能说平均复杂度还不错，但是遇到变态的字符串，会出问题！

##Brute Force
>遍历循环查找

## KMP（<a href="https://zh.wikipedia.org/wiki/%E5%85%8B%E5%8A%AA%E6%96%AF-%E8%8E%AB%E9%87%8C%E6%96%AF-%E6%99%AE%E6%8B%89%E7%89%B9%E7%AE%97%E6%B3%95">参考</a>）