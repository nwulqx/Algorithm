public class LinkedListCycle{
    public static boolean hasCycle(ListNode head) {
    	if(head==null || head.next == null) return false;
        ListNode low = head;
        ListNode high = head;
        do{
        	if(high!=null){
        		high = high.next;
        	}
        	if(high!=null){
        		high = high.next;
        	}
        	if(low!=null){
        		low = low.next;
        	}
        }while(high!=low);
        if(high==null)
        	return false;
        else
        	return true;
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