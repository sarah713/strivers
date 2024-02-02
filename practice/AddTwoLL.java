package practice;

public class AddTwoLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        return dummy.next;
    }
}

// 2 -> 4 -> 3
// 5 -> 6 -> 4

// 0 -> 7 -> 0 -> 8
