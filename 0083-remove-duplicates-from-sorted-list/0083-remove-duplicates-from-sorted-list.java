class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode i = head;
        // ListNode j = head.next;

        // while (j != null) {

        //     if (i.val == j.val) {
        //         j = j.next;
        //     } else {
        //         i.next = j;
        //         i = j;
        //         j = j.next;
        //     }

        // }

        // i.next = null;
        while(i!=null&&i.next!=null){
            if(i.val==i.next.val){
                i.next=i.next.next;
            }
            else{
                i=i.next;
            }
        }

        return head;
    }
}