# 169. Majority Element

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

# Solution

>最先想到的办法是排序，然后返回中值，但是这么做的时间复杂度是一个排序的复杂度，平均复杂度为O(nlogn)。<br/>

## Optimized

>这道题其实可以在O(n)时间复杂度完成，因为主要元素占有一半以上，可设置一个标记并遍历数组，标记为0时，改变返回值；根据标记改变返回值，因为大于一半，所以，当标记大于1时，一定返回主要元素。

