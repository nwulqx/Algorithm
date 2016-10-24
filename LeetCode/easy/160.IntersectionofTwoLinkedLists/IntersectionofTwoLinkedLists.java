public class IntersectionofTwoLinkedLists{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<ListNode>();
        while(headA!=null){
        	set.add(headA);
        	headA = headA.next;
        }
        while(headB!=null){
        	if(!set.add(headB))
        		return headB;
        	headB = headB.next;
        }
        return null;
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