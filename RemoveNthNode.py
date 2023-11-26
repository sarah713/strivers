class RemoveNthNode:
    def removeNode(head):
        dummy = ListNode(0)
        dummy.next = head

        slow,fast = dummy

        for i in range(i+1):
            fast=fast.next 

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummy.next

