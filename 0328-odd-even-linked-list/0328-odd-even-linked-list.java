class Solution {
    public ListNode oddEvenList(ListNode head) {
     if(head ==null || head.next == null) return head;
      ListNode a = head;
    ListNode dummy = new ListNode(0);
     ListNode curr = head.next;
     ListNode dh = dummy;
     int i=1;
 while (curr != null) {
    i++;

    if (i % 2 != 0) {
        a.next = curr;
        a = curr;
    } else {
        dummy.next = curr;
        dummy = curr;
    }

    curr = curr.next;
}
dummy.next = null;

a.next = dh.next;
return head;
    }
}