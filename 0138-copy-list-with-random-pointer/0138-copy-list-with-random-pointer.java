
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null ) return head;
        Node curr = head;
        Node copy = new Node(curr.val);
        Node copyHead = copy; // making a pointer for traversing without changing the head pointer
        curr = curr.next;
        // copying the list values (deep copy of the list)
        while(curr!=null){
           Node a = new Node(curr.val);
           copyHead.next = a;
           copyHead = copyHead.next;
           curr = curr.next;
        }
        curr = head;
        copyHead = copy;
        // the core of the problem
        while(curr!=null){
             Node oldRandom = curr.random;
             if(oldRandom == null){
                 copyHead.random = null;
                 copyHead = copyHead.next;
                 curr = curr.next;
                 continue;
             }
             Node og = head;
             int i=0;
             int pos =0;
             while(og!=null){
                if(oldRandom ==og){
                    pos = i;
                    break;
                }
                i++;
                og = og.next;
             }
             Node search = copy;
             Node copyRandom = null;
             int j=0;
             while(search!=null){
                 if(pos == j){
                    copyRandom = search;
                    break;
                 }
                 j++;
                 search = search.next;
             }
             copyHead.random = copyRandom;
             copyHead = copyHead.next;
             curr = curr.next;
        }
      return copy;
    }   
}