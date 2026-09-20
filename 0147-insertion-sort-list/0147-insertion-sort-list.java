
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(curr!=null && curr.next!=null){
            if(curr.val <= curr.next.val){
                curr = curr.next;
                continue;
            } 
            ListNode next = curr.next;
            curr.next = next.next;

            ListNode prev = dummy;
            while(prev.next!=null && prev.next.val < next.val){
                prev = prev.next;
            }
             next.next = prev.next;
             prev.next = next;
        }
        return dummy.next;
    }
}