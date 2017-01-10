/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedListRandomNode {
        ListNode head = null;
        Random generator = null;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        generator = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
    	ListNode node = head;
    	ListNode result = null;
        for(int n=1;node!=null;n++){
        	if(generator.nextInt(n)==0) {
        		result = node;
        	}
        	node = node.next;
        }
        return result.val;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */