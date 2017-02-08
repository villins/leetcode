/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode pre = new ListNode(0);

        while(head != null) {
            ListNode in = head;
            head = head.next;
            ListNode p = pre;

            while(p.next != null && in.val > p.next.val) {
                p = p.next;
            }

            ListNode tmp = p.next;
            p.next = in;
            in.next = tmp;
        }

        return pre.next;
    }
}
