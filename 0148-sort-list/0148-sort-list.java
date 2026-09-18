class Solution {

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode mid = findMid(head);

        ListNode low = head;
        ListNode high = mid.next;

        mid.next = null;

        low = sortList(low);
        high = sortList(high);

        return merge(low, high);
    }

    public ListNode findMid(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode low, ListNode high) {

        ListNode dummy = new ListNode(0);
        ListNode chead = dummy;

        ListNode left = low;
        ListNode right = high;

        while(left != null && right != null) {

            if(left.val < right.val) {
                chead.next = left;
                chead = left;
                left = left.next;
            }
            else {
                chead.next = right;
                chead = right;
                right = right.next;
            }
        }

        if(left != null)
            chead.next = left;
        else
            chead.next = right;

        return dummy.next;
    }
}