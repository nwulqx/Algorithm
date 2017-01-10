# 108. Convert Sorted Array to Binary Search Tree

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

Subscribe to see which companies asked this question

# Solution

## 递归+二分法

>这道题的思路主要是二分法，由于是一个BST，所以应该满足：节点的左节点小于根节点，右节点大于根节点。<br>
>所以这道题使用二分法来递归的把每一个节点放到BST中。