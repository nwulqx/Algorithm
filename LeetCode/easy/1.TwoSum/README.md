#Two Sum
Given an array of integers, return **indices** of the two numbers such that they add up to a specific target.

You may assume that each input would have ***exactly*** one solution.

**Example:**

	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].

#爆破法：
>通过两次遍历数组，找出所有两个数的组合，将结果与target比较，返回满足要求的索引，这种方法简单易懂，但是如果寻找三个数或者以上的多位相加，他的时间复杂度是指数增长的。

#Hash法：
>HashMap的数据结构是树，使用HashMap，它的查询时的时间复杂度是O(n+logn)。<br/>

#疑惑

>[{0,-2,0,0},0],对于这样的查询，HashMap中存放了相同的key的情况，是覆盖了前面
两个0的索引，所以答案是(0,3);

#逼近法
>1.将数组排序，时间复杂度为O（nlogn）。<br>
2.使用两个索引，分别从头和尾部逼近，如果相加小于target，那么头部索引++；如果小于，则尾部--，直到找到。<br>
3.时间复杂度总共为O（nlogn+n）。<br>