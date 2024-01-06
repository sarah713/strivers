public class RemoveEle {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null, cur = head;
        while (head != null && head.val == val) {
            head = head.next;
        }
        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;

    }
}
