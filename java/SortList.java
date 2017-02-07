import java.util.ArrayList;
import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        int len = 0;
        ListNode next = head;
        while (next != null) {
            len++;
            next = next.next;
        }

        int[] array = new int[len];
        next = head;
        for(int i = 0; i < array.length; i++) {
            array[i] = next.val;
            next = next.next;
        }

        Arrays.sort(array);

        next = head;
        for(int val : array) {
            next.val = val;
            next = next.next;
        }
        return head;
    }
}
