class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        else if(list1==null) return list2;
        else if(list2 == null) return list1;
         ListNode dummy = new ListNode(0);
         ListNode dh = dummy;
         ListNode a = list1;
         ListNode b = list2;
         //the merge sort algorithm
         while(list1!=null && list2!=null){
             if(list1.val < list2.val){
                 dh.next = list1;
                 dh = dh.next;
                 list1 = list1.next;
             }
             else{
                 dh.next = list2;
                 dh = dh.next;
                 list2 = list2.next;
             }
         }
         if(list1!=null){
              dh.next = list1;
              dh = dh.next;
              list1 = list1.next;
         }
         if(list2!=null){
             dh.next = list2;
             dh = dh.next;
             list2 = list2.next;
         }
         return dummy.next;
    }
}