public class MergeTwoSortedLists{
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
		ListNode node = mergeTwoLists(l1,l2);
		while(node!=null){
			System.out.println(node.val);
			if(node.next==null) break;
			else
				node = node.next;
		}
	}
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(9527);
        ListNode head = node;
        while(l1!=null || l2!=null){
        	if(l1==null){
        		head.next = l2;
        		l2 = l2.next;
        	}else if(l2==null){
        		head.next = l1;
        		l1 = l1.next;
        	}else if(l1.val<l2.val){
        		head.next = l1;
        		l1 = l1.next;
        	}else{
        		head.next = l2;
        		l2 = l2.next;
        	}
        	System.out.println(head.val);
        	head = head.next;
        }
        return node.next;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}