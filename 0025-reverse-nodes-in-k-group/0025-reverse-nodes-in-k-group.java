class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (true) {

            // Find the kth node
            ListNode curr = prev;

            for (int i = 0; i < k; i++) {
                curr = curr.next;

                // Fewer than k nodes remaining
                if (curr == null) {
                    return dummy.next;
                }
            }

            ListNode h = prev.next;      // Original head of group
            ListNode n = curr.next;      // Start of next group

            // Reverse exactly k nodes
            ListNode r = reverse(h, k);

            // Connect previous group to reversed group
            prev.next = r;

            // Original head is now the tail
            h.next = n;

            // Move prev to the tail of reversed group
            prev = h;
        }
    }

    private ListNode reverse(ListNode head, int k) {

        ListNode curr = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            ListNode n = curr.next;

            curr.next = prev;
            prev = curr;
            curr = n;
        }

        return prev;
    }
}