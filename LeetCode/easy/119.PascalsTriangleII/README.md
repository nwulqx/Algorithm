# 119. Pascal's Triangle II

Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return `[1,3,3,1]`.

**Note:**

Could you optimize your algorithm to use only O(k) extra space?

# Solution

## 通过上层来计算当前行

>使用递归或者循环来进行

**更好的方法：**

## <a href="https://en.wikipedia.org/wiki/Pascal%27s_triangle#Calculating_a_row_or_diagonal_by_itself">Calculating a row or diagonal by itself</a>

>当前行的值可以通过，改之所在行和索引来计算。

	C[k,i] = C[k,i-1]*(k-i+1)/i

k为第几行，i为改行第几个数。