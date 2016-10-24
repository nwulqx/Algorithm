# 141. Linked List Cycle

Given a linked list, determine if it has a cycle in it.

Follow up:

Can you solve it without using extra space?

# Solution

判断是不是环，可以使用快慢指针法：<br>
1. 要么，指针可以达到尾，说明不是环。<br>
2. 要么，快指针会追到慢指针，说明形成环。<br>

P.S.
>注意使用do{}while{}循环简化代码。

