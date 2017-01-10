# 260. Single Number III

Given an array of numbers `nums`, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = `[1, 2, 1, 3, 2, 5]`, return `[3, 5]`.

**Note:**

1. The order of the result is not important. So in the above example, `[5, 3]` is also correct.
2. Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

# Solution

>这道题的核心是`&`运算，利用了 `a &= -a`的特点，因为`-a`·是通过`a`取反加1得到的，那么 `a &= -a`公式可以得到一个`a`与`-a`不相同的最低位。可以用来区分`a`和`-a`。

这道题可以利用这个最低位来分割两个数组，而这两个数组又分别包含了那两个`只有一个`的元素，这样就可以利用xor分别取出两个数组中单独的元素了。

