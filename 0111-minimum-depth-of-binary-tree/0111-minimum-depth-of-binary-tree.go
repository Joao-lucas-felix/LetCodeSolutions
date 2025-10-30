/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func minDepth(root *TreeNode) int {
    if root == nil {
        return 0
    }
    
    left := minDepth(root.Left)
    right := minDepth(root.Right)
    
    // Se um dos lados for 0 (não existe), usa o outro lado
    if left == 0 || right == 0 {
        return 1 + left + right
    }
    
    return 1 + min(left, right)   
}
func min(n1, n2 int) int {
	if n1 < n2 {
		return n1
	}
	return n2
}
