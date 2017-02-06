import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        while(l1 != null) {
            a1.add(l1.val);
            l1 = l1.next;
        }

        ArrayList<Integer> a2 = new ArrayList<>();
        while(l2 != null) {
            a2.add(l2.val);
            l2 = l2.next;
        }

        int al1 = a1.size();
        int al2 = a2.size();
        int t = 0;
        int m;
        ArrayList<Integer> tmp = new ArrayList();

        while(al1 > 0 || al2 > 0) {
            if(al1 > 0) {
                t += a1.get(--al1);
            }

            if(al2 > 0) {
                t += a2.get(--al2);
            }

            if(t >= 10) {
                m = t - 10;
                t = 1;
            } else {
                m = t;
                t = 0;
            }

            tmp.add(0, m);
        }

        if(t > 0) tmp.add(0, t);

        ListNode ln = new ListNode(tmp.get(0));
        ListNode next = ln;
        for(int i = 1; i < tmp.size(); i++) {
            ListNode nt = new ListNode(tmp.get(i));
            next.next = nt;
            next = nt;
        }
        return ln;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
