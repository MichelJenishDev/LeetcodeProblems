
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        //ListNode second = headB;
        ListNode ans = null;
        while(first!=null){
            ListNode second = headB;
            while(second!=null){
                if(first == second) return second;
                second = second.next;
            }
            first = first.next;
        }
        return null;
    }
}