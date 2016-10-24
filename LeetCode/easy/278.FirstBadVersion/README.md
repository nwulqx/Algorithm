# 278. First Bad Version

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have `n` versions `[1, 2, ..., n]` and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API `bool isBadVersion(version)` which will return whether version is bad. Implement a function to find the first bad `version`. You should minimize the number of calls to the API.

# Solution

## 二分法的使用

注意边界问题，mid和low的关系判断。

>还有就是中值的计算，使用low+(high-low)/2会防止出现溢出问题。(low+high)可能会出现溢出。