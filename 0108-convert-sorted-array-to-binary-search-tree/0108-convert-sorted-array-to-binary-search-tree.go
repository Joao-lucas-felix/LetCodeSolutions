/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sortedArrayToBST(nums []int) *TreeNode {
    if len(nums) == 0 {
        return nil
    }
    
    // Encontra o meio do array
    mid := len(nums) / 2
    
    // A raiz é o elemento do meio
    root := &TreeNode{
        Val: nums[mid],
    }
    
    // Constrói recursivamente as subárvores
    root.Left = sortedArrayToBST(nums[:mid])       // elementos antes do meio
    root.Right = sortedArrayToBST(nums[mid+1:])    // elementos depois do meio
    
    return root
}
