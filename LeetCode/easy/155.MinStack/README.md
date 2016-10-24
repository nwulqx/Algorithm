# 155. Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

- push(x) -- Push element x onto stack.
- pop() -- Removes the element on top of the stack.
- top() -- Get the top element.
- getMin() -- Retrieve the minimum element in the stack.

**Example:**

	MinStack minStack = new MinStack();
	minStack.push(-2);
	minStack.push(0);
	minStack.push(-3);
	minStack.getMin();   --> Returns -3.
	minStack.pop();
	minStack.top();      --> Returns 0.
	minStack.getMin();   --> Returns -2.

# Solution

## LinkedList

使用LinkedList存储最小值，那么会出现两个问题：

1. 如果插入的数和最小值重复，应该也插入，因为弹出栈只弹出一个值，而这个值的弹出也会影响最小值。
2. 如何弹出栈，弹出栈会涉及删除最小值的问题，如果弹出的数刚好是最小值，则删去，否则就不删除。

## Two Stacks

发现LinkedList的使用好像栈的使用，那么直接使用双栈。
