impl Solution {
    pub fn shuffle(nums: Vec<i32>, n: i32) -> Vec<i32> {
        let mut ans: Vec<i32> = vec![0; 2*n as usize];

        for i in 0..n as usize {
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[i + n as usize];

        }

        ans
    }
}