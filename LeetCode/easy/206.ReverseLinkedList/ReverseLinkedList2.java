/*Using one LinkedList!
The main methed is insert node from 3rd to end between 1st and 2th node!
*/
public class ReverseLinkedList2{
    public static ListNode reverseList(ListNode head) {
    	if(head == null || head.next==null) return head;
    	ListNode node1 = head.next;
    	ListNode node2 = node1.next;
    	while(node2!=null){
    		node1.next = node2.next;
    		node2.next = head.next;
    		head.next = node2;
    		node2 = node1.next;
    	}
    	node1.next = head;
    	head = head.next;
    	node1.next.next = null;
    	return head;
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