// Definition for a binary tree node.
// #[derive(Debug, PartialEq, Eq)]
// pub struct TreeNode {
//   pub val: i32,
//   pub left: Option<Rc<RefCell<TreeNode>>>,
//   pub right: Option<Rc<RefCell<TreeNode>>>,
// }
// 
// impl TreeNode {
//   #[inline]
//   pub fn new(val: i32) -> Self {
//     TreeNode {
//       val,
//       left: None,
//       right: None
//     }
//   }
// }
use std::rc::Rc;
use std::cell::RefCell;
impl Solution {
    pub fn has_path_sum(root: Option<Rc<RefCell<TreeNode>>>, target_sum: i32) -> bool {
        match root {
            None => return false,
            Some(node) => {
                let node = node.borrow(); 
                let val = node.val; 

                if node.left.is_none() && node.right.is_none() {
                    return val == target_sum;
                }

                let soma_restante = target_sum - val; 
                Solution::has_path_sum(node.left.clone(), soma_restante) ||
                Solution::has_path_sum(node.right.clone(), soma_restante)
            }

        }
    }
}