# 234. Palindrome Linked List

Given a singly linked list, determine if it is a palindrome.

**Follow up:**

Could you do it in O(n) time and O(1) space?

# Solution

## 我的错误解法

一开始想用StringBuffer记录，然后反转比较，结果哪有这么简单。负数就无法反转。

## 快慢指针+LinkedList反转

1. 先使用快慢指针法找出中间节点，这个中间节点需要根据快指针是否为空来决定是否在向后移动，因为奇偶的关系。
2. 然后反转该中间结点后面的链表。
3. 最后循环比较头节点和中间节点。

**优缺点：**

>改变了链表的结构，但是减少了空间复杂度。

