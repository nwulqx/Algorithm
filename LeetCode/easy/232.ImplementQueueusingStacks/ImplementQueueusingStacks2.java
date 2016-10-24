/*We can only change the push method and the stack to solve this problem..
Beats:15%;
*/
public class ImplementQueueusingStacks2{
	private Stack<Integer> queue = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.empty()){
        	stack.push(queue.pop());
        }
        queue.push(x);
        while(!stack.empty()){
        	queue.push(stack.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        queue.pop();
    }

    // Get the front element.
    public int peek() {
        return queue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.empty();
    }
}