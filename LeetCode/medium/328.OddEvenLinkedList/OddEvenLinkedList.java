public class OddEvenLinkedList{
    public ListNode oddEvenList(ListNode head) {
        ListNode node = head;
        ListNode n1 = null;
        ListNode n2 = null;
        if(node!=null)
        	n1 = node.next;
        if(n1!=null)
        	n2 = n1.next;
        while(n1!=null && n2!=null){
        	n1.next = n2.next;
        	n2.next = node.next;
        	node.next = n2;
        	node = node.next;
	        n1 = n1.next;
	        if(n1!=null)
        		n2 = n1.next;
        }
        return head;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}