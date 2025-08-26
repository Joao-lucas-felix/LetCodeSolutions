# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        list = []
        if root == None: 
            return list
        return self.makeInOrderArray(root, list)


    def makeInOrderArray(self, node, list):
        if (node == None):
            return 
        else:
            self.makeInOrderArray(node.left, list)
            list.append(node.val)
            self.makeInOrderArray(node.right, list)
            return list
        