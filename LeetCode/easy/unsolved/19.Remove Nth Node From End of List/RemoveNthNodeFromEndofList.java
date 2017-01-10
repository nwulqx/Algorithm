/*So amazing method to solve
this listnode problem!
the tow index can solve a lot of problem,such as 2Sum,3Sum...
like this ,it solves the RemoveNthNodeFromEndofList!
*/
public class RemoveNthNodeFromEndofList{
	public static void main(String []args){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		// System.out.println(l1.val+"-"+l1.next.val+"-"+l1.next.next.val+"-"+l1.next.next.next.val+"-"+l1.next.next.next.next.val);
		ListNode node = removeNthFromEnd(l1,5);
		while(node!=null){
			System.out.println(node.val);
			if(node.next==null) break;
			else
				node = node.next;
		}
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prenode = new ListNode(9527);
        prenode.next = head;
        ListNode lownode = prenode;
        ListNode fastnode = prenode;
        while(n>0){
            fastnode = fastnode.next;
            n--;
        }
        while(fastnode.next!=null){
            fastnode = fastnode.next;
            lownode = lownode.next;
        }
        lownode.next = lownode.next.next;
        return prenode.next;
    }
}

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}