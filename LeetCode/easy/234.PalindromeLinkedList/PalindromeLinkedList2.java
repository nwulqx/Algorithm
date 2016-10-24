public class PalindromeLinkedList2{
	public boolean isPalindrome(ListNode head) {
    	if(head==null || head.next==null) return true;
    	if(head.next.next==null) return head.val == head.next.val;
        ListNode low = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
    		fast = fast.next;
    		fast = fast.next;
    		low = low.next;
        }
        if(fast!=null) low = low.next;
        low = reverseLinkedList(low);
        fast = head;
        while(low!=null){
        	if(fast.val != low.val)
        		return false;
        	low = low.next;
        	fast = fast.next;
        }
        return true;
	}
	public ListNode reverseLinkedList(ListNode head){
		if(head == null || head.next == null) return head;
		 ListNode node1 = head.next;
		 while(node1.next!=null){
		 	ListNode node2 = node1.next;
		 	node1.next = node2.next;
		 	node2.next = head.next;
		 	head.next = node2;
		 }
		 node1.next = head;
		 head = head.next;
		 node1.next.next = null;
		 return head;
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}