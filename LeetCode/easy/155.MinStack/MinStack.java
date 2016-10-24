/*Beats : 76%;
*/
public class MinStack {

	private Stack<Integer> stack = null;
	private List<Integer> list = null;
    /** initialize your data structure here. */
    public MinStack() {
    	this.stack = new Stack<Integer>();
        this.list = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(list.size() == 0 || list.get(list.size()-1)>=x){
        	list.add(x);
        }
    }
    
    public void pop() {
        Integer tmp = stack.pop();
        // An important judge!
        //if(tmp==list.get(list.size()-1)) is error ,because tmp is Integer Object;we can use equals;
        if(tmp.equals(list.get(list.size()-1))){
        	list.remove(tmp);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return list.get(list.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */