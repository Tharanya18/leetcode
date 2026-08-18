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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(sec!=null){
            ListNode next=sec.next;
            sec.next=prev;
            prev=sec;
            sec=next;
        }
        sec=prev;
        ListNode first=head;
        while(sec!=null){
            ListNode temp=first.next;
            ListNode temp1=sec.next;
            first.next=sec;
            sec.next=temp;
            first=temp;
            sec=temp1;
        }
       
    }
}