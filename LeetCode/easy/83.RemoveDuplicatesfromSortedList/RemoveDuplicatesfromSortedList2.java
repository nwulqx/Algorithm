/* Using recurision!*/
public class RemoveDuplicatesfromSortedList2{
	public static void main(String []args){

	}
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null || head.next == null) return head;
    	head.next = deleteDuplicates(head.next);
    	return head.val == head.next.val ? head.next : head;
    }
}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}