# 307. Range Sum Query - Mutable

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

The update(i, val) function modifies nums by updating the element at index i to val.

Example:

	Given nums = [1, 3, 5]

	sumRange(0, 2) -> 9
	update(1, 2)
	sumRange(0, 2) -> 8

Note:

1. The array is only modifiable by the update function.
2. You may assume the number of calls to update and sumRange function is distributed evenly.

# Solution

>这个问题思路简单做的话，就没有考察的意义了，好歹也是medium。<br>

>这个题想考察，我想也知道肯定是一种数据结构。

## Segment Tree(线段树)

利用二分法+二叉树的思路构建数据结构，每个节点代表一个数组。而每个节点的左子树代表0~mid的数组，而右节点代表了从mid+1~end的数组，这样构建了一个使用二分法的二叉树。

![](http://i.imgur.com/UeZDx4z.jpg)

一目了然，理论很简单，关键是这种数据结构的使用还在于熟练。熟练的使用在于勤加练习！