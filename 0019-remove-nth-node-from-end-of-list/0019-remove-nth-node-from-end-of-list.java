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
    public static int size(ListNode head){
        int size = 0;
        while(head != null){
            size += 1;
            head = head.next;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Calculate size
        int size = size(head);
         
        //  Remove
        if (n == size){
            head = head.next;
            return head;
        }
        ListNode temp = head;
        int i = 1;
        while(i < size-n){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}