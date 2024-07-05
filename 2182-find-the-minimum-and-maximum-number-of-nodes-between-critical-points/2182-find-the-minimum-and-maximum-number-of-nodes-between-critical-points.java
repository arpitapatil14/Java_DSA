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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstCriticalIndex    = 0;
        int previousCriticalIndex = 0;

        int prevValue = 0;
        int currValue = 0;
        int nextValue = 0;

        int minDistance = Integer.MAX_VALUE;
        int index = 0;
        int[] result = {-1, -1};

        while (head != null) {
            prevValue = currValue;
            currValue = nextValue;
            nextValue = head.val;

            if (prevValue != 0 && currValue != 0 && nextValue != 0 && 
                ((prevValue > currValue && currValue < nextValue) ||
                (prevValue < currValue && currValue > nextValue))) {
                
                if (firstCriticalIndex == 0) {
                    firstCriticalIndex = index;
                } else {
                    minDistance = Math.min(minDistance, index - previousCriticalIndex);
                    result[0] = minDistance;
                    result[1] = index - firstCriticalIndex;
                }
                previousCriticalIndex = index;
            }

            index++;
            head = head.next;
        }

        return result;
    }
}