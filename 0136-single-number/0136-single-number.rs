use std::collections::HashMap;

impl Solution {
    pub fn single_number(nums: Vec<i32>) -> i32 {
        let mut map: HashMap<i32, u8> = HashMap::new();
        for num in nums { 
            if !map.contains_key(&num){
                map.insert(num, 1);
            }else {
                map.insert(num, 2);
            } 
        
        }
        for (x,y) in &map { 
            if *y == 1 {return *x};
        }
        return 0;
    }
}