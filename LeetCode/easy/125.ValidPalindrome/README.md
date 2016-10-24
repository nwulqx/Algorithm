# 125. Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

**For example,**

`"A man, a plan, a canal: Panama"` is a palindrome.<br>
`"race a car"` is not a palindrome.

**Note:**

Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

# Solution

>使用正则表达式过滤。`[^a-zA-Z0-9]`，过滤非字符数字。

>这样做的效率比较低，因为正则表达式创建了一个新的空间，空间复杂度为O(n)。

# Optimized

减少空间复杂度，直接判断，使用双指针+Character.isLetterOrDigit()方法，可以很方便的判断是否对称。