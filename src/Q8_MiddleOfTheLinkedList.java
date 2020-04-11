public class Q8_MiddleOfTheLinkedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;

        while (p2 != null) {
            if (p2.next != null) {
                p1 = p1.next;
                p2 = p2.next.next;
            } else return p1;
        }

        return p1;
    }


}
