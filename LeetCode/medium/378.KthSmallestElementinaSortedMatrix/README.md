# 378. Kth Smallest Element in a Sorted Matrix

Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example:

	matrix = [
	   [ 1,  5,  9],
	   [10, 11, 13],
	   [12, 13, 15]
	],
	k = 8,

	return 13.

Note: 
You may assume k is always valid, 1 ≤ k ≤ n2.

# Solution

## PriorityQueue 方法

最简单的是将所有元素全部放到队列中，取出第k个元素即是结果。

## 优化

左上最小，右下最大，从左上开始，添加到队列，执行k-1次循环，每次弹出优先级队列中的头元素（最小的元素），并把这个元素的column+1和raw+1的元素再放到队列中。这样执行k-1次后，去头元素就是结果。