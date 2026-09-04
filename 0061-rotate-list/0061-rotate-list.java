
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //ListNode prev = null;
        if(head ==null || head.next==null || k==0) return head;
        int n = length(head);
        k = k%n;
        for(int i=0;i<k;i++){
            ListNode prev = null;
            ListNode current = head;
            while(current.next!=null){
                prev = current;
                current = current.next;
            }
            current.next = head;
            prev.next = null;
            head = current;
        }
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