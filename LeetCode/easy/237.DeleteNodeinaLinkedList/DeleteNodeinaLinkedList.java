/*wocao,6666666,very smart method!*/
public class DeleteNodeinaLinkedList{
	public static void main(String []args){

	}
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}