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
    public int count(ListNode head){
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        int n=count(head);
        if(head==null||head.next==null) return head;
        k=k%n;

        if(k==0) return head;
        for(int i=1;i<=k+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode a=slow.next;
        ListNode b=slow.next;
        slow.next=null;

        while(a.next!=null){
            a=a.next;
        }
        a.next=head;
        return b;
        

        
    }
}