# 237. Delete Node in a Linked List

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is `1 -> 2 -> 3 -> 4` and you are given the third node with value 3, the linked list should become `1 -> 2 -> 4` after calling your function.

# Solution

>由于不能获取上层节点索引，所以，要想删除当前结点，唯一的办法是将下个节点复制到当前结点，在删除下个节点（因为下个节点的上层节点是当前结点）。