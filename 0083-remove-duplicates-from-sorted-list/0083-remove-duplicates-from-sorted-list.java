class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null) return head;
        ListNode prev= head;
        ListNode current = head.next;
        while(current!=null){
            if(prev.val == current.val){
                prev.next = current.next;
            }
            else{
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}