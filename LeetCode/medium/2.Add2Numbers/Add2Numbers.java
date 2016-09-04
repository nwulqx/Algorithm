public class Add2Numbers{
	public static void main(String []args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		// l2.next = new ListNode(6);
		// l2.next.next = new ListNode(4);
		ListNode l5 = addTwoNumbers(l1,l2);
		System.out.println(l5.val+":"+l5.next.val+":"+l5.next.next.val);
	}
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode l3 = new ListNode(0);
    	ListNode l4 = l3;
    	int add=0,tmp;
    	while(add!=0||l1!=null||l2!=null){
    		if((add!=0)&&(l1==null&&l2==null)) tmp = add;
    		else if(l1==null) tmp = l2.val+add;
    		else if(l2==null) tmp = l1.val+add;
    		else tmp = l1.val+l2.val+add;
    		if(tmp<10) {
    			l4.val = tmp;
    			add=0;
    		}
    		else{
    			l4.val = tmp%10;
    			tmp/=10;
    			add = tmp%10;
    		}
    		if(l1!=null) l1 = l1.next;
			if(l2!=null) l2 = l2.next;
			if(add!=0||l1!=null||l2!=null){
				l4.next = new ListNode(0);
				l4 = l4.next;
			}
    	}
    	return l3;
    }
}
/**
 * Definition for singly-linked list.
 * 
 */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}