/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int l=0;
        while(temp!=null){
         temp=temp.next;
         l++;
        }
        ListNode st=head;
        ListNode end=head;
        for(int i=1;i<k;i++){
            st=st.next;
        }
        for(int i=1;i<=l-k;i++){
            end=end.next;
        }
       int t=st.val;
         st.val=end.val;
         end.val=t;

         return head;

    }
}