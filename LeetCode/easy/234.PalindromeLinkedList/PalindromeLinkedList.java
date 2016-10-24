/*Time Limit Exceeded
*/
public class PalindromeLinkedList{
	public static void main(String []args){
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.append(1).append(-1).toString());
	}
    public boolean isPalindrome(ListNode head) {
    	if(head==null || head.next==null) return true;
    	if(head.next.next==null) return head.val == head.next.val;
        ListNode low = head;
        ListNode fast = head;
        while(fast.next!=null){
        	if(fast.next!=null)
        		fast = fast.next;
        	if(fast.next!=null)
        		fast = fast.next;
        	if(low.next!=null)
        		low = low.next;
        }
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        while(low!=null){
        	sb1.append(head.val);
        	sb2.append(low.val);
        	head = head.next;
        	low = low.next;
        }
        return sb1.toString().equals(sb2.reverse().toString());
    }
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}