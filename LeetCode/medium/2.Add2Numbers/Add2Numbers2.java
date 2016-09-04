public class Add2Numbers2{
	public static void main(String []args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		// l2.next.next = new ListNode(4);
		ListNode l5 = addTwoNumbers(l1,l2);
		System.out.println(l5.val+":"+l5.next.val+":"+l5.next.next.val);
	}
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode digit_1 = l1;
        ListNode digit_2 = l2;
        ListNode p = new ListNode(0);
        ListNode sum = new ListNode(0);
        p.next = sum;
        
        int carry = 0;
        
        while(digit_1 != null || digit_2 != null){
            int addUp = (digit_1 != null ? digit_1.val : 0) + (digit_2 != null ? digit_2.val : 0) + carry;
            sum.next = (carry = addUp / 10) == 0 ? new ListNode(addUp) : new ListNode(addUp % 10);
            if(digit_1 != null)
                digit_1 = digit_1.next;
            if(digit_2 != null)
                digit_2 = digit_2.next;
            sum = sum.next;
        }
        
        if(carry > 0){
            sum.next = new ListNode(carry);
        }
        
        return p.next.next;
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