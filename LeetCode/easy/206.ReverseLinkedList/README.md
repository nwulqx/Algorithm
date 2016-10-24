# 206. Reverse Linked List

Reverse a singly linked list.

# Solution

## 借助另一个LinkedList空间
>时间复杂度O(n)，空间复杂度O(n)

## 只在当前LinkedList上修改

>时间复杂度O(n)，空间复杂度O(1)

**两种思路：**

1. 在第一和第二节点间不断的插入第三个节点到第n个节点。然后将第一个节点插入到结尾。
2. 将第二个节点的下一个节点指向第一个，将第三个节点的下一个节点指向第二个，然后循环。