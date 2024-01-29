class Solution:
    def diameterOfBT(root):
        maxD = []
        helper(root,maxD)
        return maxD[0]

    def helper(root,maxD):
        if not root:
            return 0

        lh = helper(root.left,maxD)
        rh = helper(root.right,maxD)

        maxD[0] = max(maxD[0],lh+rh)
        return 1+max(lh,rh)
        