# 88. Merge Sorted Array

Given two sorted integer arrays *nums1* and *nums2*, merge *nums2* into *nums1* as one sorted array.

**Note:**

You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

# Solution

借助另一个空间，空间复杂度O(n)

## Optimized

其实这道题需求有点奇怪，m指nums1的大小，n指nums2的大小。其实只要换一个思路，从nums1尾部倒着来填补就可以了。