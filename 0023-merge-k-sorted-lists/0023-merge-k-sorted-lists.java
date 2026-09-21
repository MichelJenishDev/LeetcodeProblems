class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        //ListNode dh = dummy;
        int n = lists.length;
        if(n==0) return null;
        if(n==1) return lists[0];
        ListNode left = lists[0];
        for(int i=1;i<n;i++){
            ListNode dh = dummy;
            ListNode right = lists[i];
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
           left = dummy.next;

        }
        return dummy.next;
    }
}