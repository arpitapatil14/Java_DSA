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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            ListNode temp1 = temp.next;
            int sum = 0;
            while (temp1 != null && temp1.val != 0) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            temp.val = sum;
            temp.next = temp1;
            if(temp1.next==null && temp1.val==0){
                temp.next=null;
                return head;
            }
            temp = temp1;
        }
        return head;
    }
}