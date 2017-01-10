# 382. Linked List Random Node

Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up:
What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

Example:

	// Init a singly linked list [1,2,3].
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);
	Solution solution = new Solution(head);

	// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
	solution.getRandom();

# Solution

http://blog.jobbole.com/42550/

https://en.wikipedia.org/wiki/Reservoir_sampling

前n-1个数据中数据被返回的概率为：(1/(n-1))*((n-1)/n)= 1/n

### 一句话概括

第m个对象最终被选中的概率=选择m的概率*其后面所有对象不被选中的概率

P = 1/m *(m/(m+1)*((m+1)/(m+2))*……((n-1)/(n))) = 1/n

### 实现中的问题

必须遍历所有元素，才可以得到1/n的概率选取。