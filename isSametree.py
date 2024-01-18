class TreeNode:
    def __init__(self, value=0, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def isSameTree(p, q):
    # Base case: both nodes are None
    if not p and not q:
        return True
    # Check if both nodes are not None and have the same value
    if p and q and p.value == q.value:
        # Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)
    # If any of the above conditions is not met, the trees are not the same
    return False

# Example usage:
# Create Tree 1
tree1 = TreeNode(1)
tree1.left = TreeNode(2)
tree1.right = TreeNode(3)

# Create Tree 2
tree2 = TreeNode(1)
tree2.left = TreeNode(2)
tree2.right = TreeNode(3)

# Check if the trees are the same
result = isSameTree(tree1, tree2)

if result:
    print("The trees are the same.")
else:
    print("The trees are not the same.")
