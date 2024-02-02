package practice;

public class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;

        int len = 1;
        ListNode tmp = head;
        while (tmp.next != null) {
            len++;
            tmp = tmp.next;
        }

        k = k % len;

        if (k == 0)
            return head;

        ListNode newTail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        tmp.next = head;
        return newHead;

    }
}