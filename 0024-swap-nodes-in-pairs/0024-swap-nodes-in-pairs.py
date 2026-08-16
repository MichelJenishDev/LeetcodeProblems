class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        # 1. Store the second node
        second = head.next
        
        # 2. Recursively swap the rest of the list and attach to head.next
        head.next = self.swapPairs(second.next)
        
        # 3. Make second point back to head
        second.next = head
        
        # 4. second is the new head of this swapped pair
        return second