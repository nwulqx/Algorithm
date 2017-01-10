/*
A more explicit method!
Generate two LinkedLists contain odd ande even number node!Then combine two LinkedLists.
*/
public class OddEvenLinkedList2{
    public ListNode oddEvenList(ListNode head) {
       if (head != null) {
        
            ListNode odd = head, even = head.next, evenHead = even; 
        
            while (even != null && even.next != null) {
                odd.next = odd.next.next; 
                even.next = even.next.next; 
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead; 
        }
        return head;
    }
}