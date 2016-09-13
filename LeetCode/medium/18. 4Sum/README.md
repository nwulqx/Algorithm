#4Sum
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

**Note**: The solution set must not contain duplicate quadruplets.

	For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

	A solution set is:
	[
	  [-1,  0, 0, 1],
	  [-2, -1, 1, 2],
	  [-2,  0, 0, 2]
	]

##解决：
>基于3Sum以及2Sum思想，其**平均**时间复杂度为O(n3)，为什么说平均？<br>
>算法的优化在于特殊情况的考虑，可以很快的去除一些特殊情况，进而可以加大运行效率。

##FourSum2是优化后
>同比与未优化的FourSum2，它击败了90%的算法，而不优化的算法击败了17%的人，可见优化带来的效益！

##建议优化2Sum，3Sum，4Sum