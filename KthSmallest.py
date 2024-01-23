class Solution:
    def kthSmallest(self,root,k):
        self.kth=None
        self.k=k
        self.helper(root)

    def helper(self,node):
        if not node:
            return
        self.helper(node.left)
        self.k-=1
        if self.k == 0:
            self.res = node.val 
            return
        self.helper(node.right)
        
