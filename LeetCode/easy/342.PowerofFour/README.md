# 342. Power of Four

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

**Example:**

Given num = 16, return true. Given num = 5, return false.

**Follow up:** Could you solve it without loops/recursion?

# Solution

1. 暴力法
2. (n&0b01010101010101010101010101010101)==n，因为这个二进制串上的每一位都是4的幂次，所以与运算会过滤。