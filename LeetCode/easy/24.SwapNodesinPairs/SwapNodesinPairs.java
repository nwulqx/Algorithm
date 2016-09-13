public class SwapNodesinPairs{
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
		ListNode node = swapPairs(l1);
		while(node!=null){
			System.out.println(node.val);
			if(node.next==null) break;
			else
				node = node.next;
		}
	}
    public static ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(9527);
        node.next = head;
        ListNode temp = node;
        while(temp.next!=null&&temp.next.next!=null){
        	ListNode first = temp.next;
        	ListNode second = temp.next.next;
        	first.next = second.next;
        	second.next = first;
        	temp.next = second;
        	temp = temp.next.next;
        }
        return node.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}