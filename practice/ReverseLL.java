package practice;

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}