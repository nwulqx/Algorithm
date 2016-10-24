/*Using one queue to solve this problem!
*/
public class ImplementStackusingQueues{
	Queue<Integer> q = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> q2 = new LinkedList<Integer>();
        while(!q.isEmpty()){
        	q2.add(q.poll());
        }
        q.add(x);
        while(!q2.isEmpty()){
        	q.add(q2.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}