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
            size++;
            head = head.next;
        }
        return size;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        int n = size(head);
        k = k % n;
        if(k == 0 || k == n){
            return head;
        }
        
        ListNode prev = head;
        ListNode temp = null;
        ListNode last = head;
        int j = 1;

        while(last.next != null){
            last = last.next;
            if(j < n-k){
                prev = prev.next;
                j++;
            }
        }
        temp = prev.next;
        prev.next = null;
        last.next = dummy.next;
        dummy.next = temp;

        return dummy.next;
    }
}