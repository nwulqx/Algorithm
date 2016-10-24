/*Beats: 23%;
*/
public class ImplementQueueusingStacks{
	private Stack<Integer> in = new Stack<Integer>();
	private Stack<Integer> out = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        in.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!in.empty()){
        	out.push(in.pop());
        }
        out.pop();
        while(!out.empty()){
        	in.push(out.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while(!in.empty()){
        	out.push(in.pop());
        }
        int result = out.peek();
        while(!out.empty()){
        	in.push(out.pop());
        }
        return result;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return in.empty();
    }
}