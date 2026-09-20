class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode dummy = new ListNode(0);
        ListNode dh = dummy;
        ListNode carry  = new ListNode(0);
        while(first!=null && second!=null){
            ListNode sum = new ListNode(-1);
            sum.val = (first.val + second.val + carry.val)%10;
            carry.val =(first.val + second.val+carry.val)/10; 
            dh.next = sum;
            dh = sum;
            first = first.next;
            second = second.next;
        }
         if(first == null && second == null){
              if(carry.val == 1) dh.next = carry;
              return dummy.next;
         }
         while(first!=null){
            ListNode sum1 = new ListNode(0);
             sum1.val = (first.val + carry.val)%10;
             carry.val = (first.val + carry.val)/10;
              dh.next = sum1;
             dh = sum1;
             if(carry.val == 1) dh.next = carry;
            first = first.next;
        }
        while(second!=null){
             ListNode sum2 = new ListNode(0);
             sum2.val = (second.val+ carry.val)%10;
             carry.val =(second.val+carry.val)/10; 
            dh.next = sum2;
            dh = sum2;
            if(carry.val == 1) dh.next = carry;
            second = second.next;
        }
        return dummy.next;
    }
}