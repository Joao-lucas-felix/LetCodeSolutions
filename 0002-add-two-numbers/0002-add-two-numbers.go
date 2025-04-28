/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    return sumNode(l1,l2,false)
}
func sumNode(l1, l2 *ListNode, rest bool) *ListNode {
	if l1 == nil && l2 == nil {      
		if rest {
			return &ListNode{Val: 1, Next: nil} 
		}
		return nil 
	}

	var v1 , v2 int 
	var next1, next2 *ListNode

	if l1 == nil {
		v1 = 0
		next1 = nil
	}else {
		v1 = l1.Val
		next1 = l1.Next
	}
	if l2 == nil {
		v2 = 0
		next2 = nil
	}else {
		v2 = l2.Val
		next2 = l2.Next
	}

	

	val := v1 + v2

	if rest {
		rest = false
		val++ 
	}
	if val >= 10 {
		val %= 10
		rest = true
	} 

	return &ListNode{Val: val, Next: sumNode(next1, next2, rest)}
}
