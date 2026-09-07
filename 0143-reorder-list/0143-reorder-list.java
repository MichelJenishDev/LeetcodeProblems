class Solution {
    public void reorderList(ListNode head) {
        ListNode pos = head;
        while(pos.next!=null && pos.next.next!=null){
            ListNode curr = head;
            ListNode prev = null;
            while(curr.next!=null){
                prev = curr;
                curr = curr.next;
            }
            curr.next = pos.next;
            pos.next = curr;
            prev.next = null;
            pos = pos.next.next;
        }
    }
}