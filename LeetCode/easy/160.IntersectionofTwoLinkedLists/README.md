# 160. Intersection of Two Linked Lists

Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

	A:          a1 → a2
	                   ↘
	                     c1 → c2 → c3
	                   ↗            
	B:     b1 → b2 → b3

begin to intersect at node c1.

**Notes:**

- If the two linked lists have no intersection at all, return null.
- The linked lists must retain their original structure after the function returns.
- You may assume there are no cycles anywhere in the entire linked structure.
- Your code should preferably run in O(n) time and use only O(1) memory.

# Solution

这题首先想到了Set集合，便利两条链表，直到找到相同，返回当前Node。

# Optimized(Amazing!)

这题有一个经典的思路，设置两个节点分别从两个链表向后遍历，如果结束则跳到另一个链表，由于相同部分走的步数一样，那么相当于两个节点将同时跑完两个链表不同的部分。将在相同的节点处停止。