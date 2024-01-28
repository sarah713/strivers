class Solution:
    def connect(root):
        if not root:
            return root
        queue=[root]
        while queue:
            size = len(queue)
            for i in range(size):
                cur = q.pop(0)
                if i == size-1:
                    cur.next = null

                else:
                    cur.next = queue[0]  # Corrected 'queue.peek()' to 'queue[0]'

                if cur.left:
                    queue.append(cur.left)
                if cur.right:
                    queue.append(cur.right)

        return root