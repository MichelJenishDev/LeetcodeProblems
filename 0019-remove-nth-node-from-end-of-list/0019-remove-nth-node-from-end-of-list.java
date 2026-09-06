class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
         if(head.next == null) return null;
         int l = length(head);
         ListNode current = head;
         ListNode prev= head;
         if( l == n) {
             head = head.next;
             return head;
         }
         for(int i=1;i<=(l-n);i++){
            prev = current;
            current = current.next;
         }
         prev.next = current.next; 
         return head;
    }
    public static int length(ListNode head){
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}