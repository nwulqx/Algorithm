/*Using two stack is more efficient!
*/
public class MinStack2{
	private Stack<Integer> stack = null;
	private Stack<Integer> min = null;
    /** initialize your data structure here. */
    public MinStack() {
    	this.stack = new Stack<Integer>();
        this.min = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(min.empty() || min.peek()>=x){
        	min.push(x);
        }
    }
    
    public void pop() {
        Integer tmp = stack.pop();
        // An important judge!
        //if(tmp==list.get(list.size()-1)) is error ,because tmp is Integer Object;we can use equals;
        if(tmp.equals(min.peek())){
        	min.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}