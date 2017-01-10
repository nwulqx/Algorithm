# 384. Shuffle an Array

Shuffle a set of numbers without duplicates.

Example:

	// Init an array with set 1, 2, and 3.
	int[] nums = {1,2,3};
	Solution solution = new Solution(nums);

	// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
	solution.shuffle();

	// Resets the array back to its original configuration [1,2,3].
	solution.reset();

	// Returns the random shuffling of array [1,2,3].
	solution.shuffle();

# Solution

http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array

思路：选取第一个元素的概率是1/n，第二个是1/(n-1),......,1/1

知道了这个基本可以写出循环，但是循环中有2个问题：
1. 第一个数的选取概率是1/n，依此递减。

2. 随机选取的数字不应该存在于随机选取的数列中，随机选取的索引应该和循环索引交换，也就是说将随机选取的数字放到不参加随机的索引处。