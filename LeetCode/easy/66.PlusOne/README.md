# 66. Plus One

Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

# Solution

## 从低位加

**for循环**：如果小于9，加1，返回。
**while循环**：从右边开始，大于9，置0，并索引减一。