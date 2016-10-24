/*Another two queues method!
Not a good method!
I made a mistake in this method ,beacuse the queue is dynamic size,when we use the poll method ,
the Queue's size is sub 1,so we need to use a variable to remember Queue's size;
*/
public class ImplementStackusingQueues4{
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
	    // Push element x onto stack.
	    public void push(int x) {
	        if(!q1.isEmpty()){
	        	q1.add(x);
	        }else{
	        	q2.add(x);
	        }
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        if(!q1.isEmpty()){
	        	int size = q1.size();
	        	for(int i=1;i<size;i++){
	        		q2.add(q1.poll());
	        	}
	        	q1.poll();
	        }else{
	        	int size = q2.size();
	        	for(int i=1;i<size;i++){
	        		q1.add(q2.poll());
	        	}
	        	q2.poll();
	        }
	    }

	    // Get the top element.
	    public int top() {
	        int rsult;
	        if(!q1.isEmpty()){
	        	int size = q1.size();
	        	for(int i=1;i<size;i++){
	        		q2.add(q1.poll());
	        	}
	        	rsult = q1.poll();
	        	q2.add(rsult);
	        }else{
	        	int size = q2.size();
	        	for(int i=1;i<size;i++){
	        		q1.add(q2.poll());
	        	}
	        	rsult = q2.poll();
	        	q1.add(rsult);
	        }
	        return rsult;
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return q1.isEmpty() && q2.isEmpty();
	    }
}