
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
       
        while(true){
            ListNode curr = prev;
            for(int i=0;i<k;i++){
                curr = curr.next;
                 if(curr == null) return dummy.next;
            }
                 ListNode h = prev.next;
                 ListNode n = curr.next;
                 ListNode r = reverse(h,k);
                 prev.next = r;
                 h.next = n;
                 prev = h;
            }
        }

    public static ListNode reverse(ListNode h,int k){
        ListNode curr = h;
        ListNode prev=  null;
        for(int i=1;i<=k;i++){
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }
}