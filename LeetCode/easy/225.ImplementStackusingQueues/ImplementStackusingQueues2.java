/*Using two queues and modified push()
*/
public class ImplementStackusingQueues2{
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
    	if(q1.isEmpty()){
    		q1.add(x);
    		while(!q2.isEmpty()){
    			q1.add(q2.poll());
    		}
    	}else if(q2.isEmpty()){
    		q2.add(x);
    		while(!q1.isEmpty()){
    			q2.add(q1.poll());
    		}
    	}
    }

    // Removes the element on top of the stack.
    public void pop() {
    	if(!q1.isEmpty()){
    		q1.poll();
    	}else{
    		q2.poll();
    	}
    }

    // Get the top element.
    public int top() {
    	if(!q1.isEmpty()){
    		return q1.peek();
    	}else{
    		return q2.peek();
    	}
    }

    // Return whether the stack is empty.
    public boolean empty() {
    	return q1.isEmpty() && q2.isEmpty();
    }
}