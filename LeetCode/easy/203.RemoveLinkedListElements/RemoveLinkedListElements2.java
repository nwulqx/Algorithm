/*
Using recursion!
*/
public class RemoveLinkedListElements2{
	public ListNode removeElements(ListNode head, int val) {
		if(head==null) return head;
		head.next = removeElements(head.next,val);
		return head.val == val?head.next:head;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}