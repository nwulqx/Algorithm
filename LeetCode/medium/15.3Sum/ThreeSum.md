#3Sum
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

**Note**: The solution set must not contain duplicate triplets.

	For example, given array S = [-1, 0, 1, 2, -1, -4],
	
	A solution set is:
	[
	  [-1, 0, 1],
	  [-1, -1, 2]
	]
#Brute Force
>暴力查找的时间复杂度为O(n3)<br>
>同时需要考虑跳过重复值的操作

#O(n2+logn)
>借助二分查找可以讲3Sum的时间复杂度优化为（n2+logn）。<br>

#双指针方法 | | 逼近法

>1.将数组排序，时间复杂度为O（nlogn）。<br>
>2.使用两个索引，分别从头和尾部逼近，如果相加小于target，那么头部索引++；如果小于，则尾部--，直到找到。<br>
>3.时间复杂度总共为O（nlogn+n）。<br>

类同于TwoSum方法，只不过需要外层循环target-nums[i]，以获取两个数相加的和！