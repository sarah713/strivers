class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        ans=[]
        if not root:
            return []

        q = deque([root])
        while q:
            length = len(q)
            ans.append([])
            for i in range(length):
                node = q.popleft()
                ans[-1].append(node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)

        return ans