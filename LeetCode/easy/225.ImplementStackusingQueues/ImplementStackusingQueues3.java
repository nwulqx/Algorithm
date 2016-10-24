/*TRUELY One queue rotate method!
*/
public class ImplementStackusingQueues3{
	Queue<Integer> q = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++){
        	q.add(q.poll());
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