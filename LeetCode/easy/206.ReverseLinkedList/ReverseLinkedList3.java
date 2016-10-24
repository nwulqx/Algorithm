public class ReverseLinkedList3{
    public static ListNode reverseList(ListNode head) {
    	if(head == null) return head;
    	 ListNode node1 = head.next;
    	 head.next = null;
    	 while(node1 !=null){
    	 	ListNode node2 = node1.next;
    	 	node1.next = head;
    	 	head = node1;
    	 	node1 = node2;
    	 }
    	 return head;
    }
}
class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}