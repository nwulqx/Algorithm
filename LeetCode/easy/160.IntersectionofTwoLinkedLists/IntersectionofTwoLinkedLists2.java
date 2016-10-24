/*A very clever method!
Beats:37%;
*/
public class IntersectionofTwoLinkedLists2{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	/*Boundary check*/
    	if(headA == null || headB == null) return null;
    	ListNode a = headA;
    	ListNode b = headB;
    	while(a!=b){
    		a = a == null?headB : a.next;
    		b = b == null?headA : b.next;
    	}
    	return a;
    }
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}