# 232. Implement Queue using Stacks

Implement the following operations of a queue using stacks.

- push(x) -- Push element x to the back of queue.
- pop() -- Removes the element from in front of queue.
- peek() -- Get the front element.
- empty() -- Return whether the queue is empty.

**Notes:**

- You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
- Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
- You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

# Solution

https://leetcode.com/articles/implement-queue-using-stacks/

使用一个栈，是用两个栈。

## 一个栈

一个栈的技巧是在push时，按照队列的顺序进行push。

## 两个栈

技巧很多：

1. 一个栈用于做输入存储，一个栈用来做输出存储。
2. 输入栈正常push，输出栈主要用于输出：a.不为空时，输出从输出栈输出。b.为空时，应该把输入栈中的元素取出到输出栈，然后pop输出栈。

**优势**：利用了双栈的技巧，避免了来回移动栈中元素。