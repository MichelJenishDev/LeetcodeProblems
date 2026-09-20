class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1 == null ) return list2;
       if(list2 == null ) return list1;
       if(list1 == null && list2 ==null) return null;
       ListNode left = list1;
       ListNode right = list2;
       ListNode dummy = new ListNode(0);
       ListNode dh = dummy;
          while(left!=null && right!=null){
              if(left.val<= right.val){
                 dh.next = left;
                 dh = left;
                 left = left.next;
              }
              else{
                 dh.next=  right;
                 dh = right;
                 right = right.next;
              }
          }
          while(left!=null){
            dh.next = left;
                 dh = left;
                 left = left.next;
          }
          while(right!=null){
              dh.next=  right;
              dh = right;
             right = right.next;
          }
          return dummy.next;
       }
}
