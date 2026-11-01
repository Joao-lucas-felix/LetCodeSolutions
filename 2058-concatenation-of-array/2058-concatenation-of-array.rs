impl Solution {
    pub fn get_concatenation(nums: Vec<i32>) -> Vec<i32> {
        
        let n = nums.len();

        // faz um vetor de tamanho 2n preenchido com zeros
        let mut ans: Vec<i32> = vec![0; 2 * n];

        // percorre de um a n prechendo as duas posiÃ§Ãµes
        for i in 0..n {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        ans
    }
}