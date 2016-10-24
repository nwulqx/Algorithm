/*This method using loop,but you can release it with recurision!1*/
public class RemoveDuplicatesfromSortedList{
	public static void main(String []args){
	}
    public static ListNode deleteDuplicates(ListNode head) {
    	ListNode node = new ListNode(9527);
    	node.next = head;
        while(head!=null){
        	if(head.next!=null && head.val==head.next.val){
        		head.next = head.next.next;
        	}else{
        		head = head.next;
        	}
        }
        return node.next;
    }
}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}