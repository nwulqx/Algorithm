/*Using another ListNode to store the LinkedList!
*/
public class ReverseLinkedList{
	public static void main(String []args){

	}
    public static ListNode reverseList(ListNode head) {
        ListNode node = new ListNode(9527);
        while(head!=null){
        	ListNode n1 = head;
        	head = head.next;
        	n1.next = node.next;
        	node.next = n1;
        }
        return node.next;
    }
}
class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}