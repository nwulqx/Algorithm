public class RemoveLinkedListElements{
    public ListNode removeElements(ListNode head, int val) {
    	ListNode node1 = new ListNode(9527);
    	node1.next = head;
    	ListNode node2 = node1;
    	while(head!=null){
    		if(head.val==val){
    			node2.next = head.next;
    			head = node2.next;
    		}else{
    			node2 = node2.next;
    			head = head.next;
    		}
    	}
        return node1.next;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}