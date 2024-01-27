class Solution:
    def leftView(root):
        if not root:
            return []

        result=[]
        queue=[root]

        while queue:
            size = leb(queue)
            for i in range(size):
                node = queue.pop(0)

                if i==0:
                    result.append(node.val)

                if node.left:
                    queue.append(node.left)

                if node.right:
                    queue.append(node.right)

        return result