/*
Beats:87%;
*/
public class ImplementQueueusingStacks3{
    // Push element x to the back of queue.
    private Stack<Integer> in = new Stack<Integer>();
    private Stack<Integer> out = new Stack<Integer>();
    public void push(int x) {
        in.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!out.empty()){
        	out.pop();
        }else{
        	while(!in.empty()){
        		out.push(in.pop());
        	}
        	out.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if(!out.empty()){
        	return out.peek();
        }
    	while(!in.empty()){
    		out.push(in.pop());
    	}
    	return out.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return out.empty()&&in.empty();
    }
}