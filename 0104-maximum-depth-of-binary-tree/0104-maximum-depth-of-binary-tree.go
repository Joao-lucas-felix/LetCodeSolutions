/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
 func getMax(n1, n2 int) int {
	if n1 > n2 {
		return n1
	}
	if n2 > n1 {
		return n2
	}
	return n1
}
func maxDepth(root *TreeNode) int {
    if root == nil {
        return 0
    }
    
    leftDepth := maxDepth(root.Left)
    rightDepth := maxDepth(root.Right)
    
    return getMax(leftDepth, rightDepth) + 1 
}