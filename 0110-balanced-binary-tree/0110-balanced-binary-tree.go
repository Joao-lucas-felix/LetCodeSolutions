/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isBalanced(root *TreeNode) bool {
	if root == nil {
		return true
	}

	leftHeight := calcHeight(root.Left)
	rightHeight := calcHeight(root.Right)

	v := math.Abs(float64(leftHeight - rightHeight))
	return v <= 1 && isBalanced(root.Left) && isBalanced(root.Right)
}

func calcHeight(node *TreeNode) int {
	if node == nil {
		return 0
	}
	leftHeight := calcHeight(node.Left)
	rightHeight := calcHeight(node.Right)

	// Retorna a altura máxima + 1
	return max(leftHeight, rightHeight) + 1
}
func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}