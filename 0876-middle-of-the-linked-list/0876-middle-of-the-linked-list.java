class Solution {
    public ListNode middleNode(ListNode head) {
        int n = length(head);
        ListNode current = head;
        int mid = n/2;
        for(int i=1;i<=mid;i++){
            current = current.next;
        }
        return current;
    }
    public static int length(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}