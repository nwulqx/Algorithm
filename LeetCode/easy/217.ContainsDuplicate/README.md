# 217. Contains Duplicate

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

# Solution

>两种方法解决:<br/>
>1. 使用HashSet可以很好的查重，时间复杂度为O(n)。
>2. 可以使用排序，然后遍历，时间复杂度为O(nlogn+n)=O(logn)。