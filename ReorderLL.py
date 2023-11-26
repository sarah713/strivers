class ReorderLL(object):
    def reorder(self,head):
        if not head or not head.next:
            return head
        
        # find middle of LL
        slow,fast = head,head 
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        
        # reverse second half
        prev = null
        while slow:
            next = slow.next 
            slow.next = prev 
            prev = slow
            slow = next

        # merge
        first = head
        second = prev 

        while second.next:
            temp = first.next 
            first.next = second
            first = temp 

            temp = second.next
            second.next = first
            second = temp 
        return head
            

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next