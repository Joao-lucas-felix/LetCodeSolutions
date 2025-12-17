impl Solution {
    pub fn is_palindrome(s: String) -> bool {
        let my_str: String = s.to_lowercase()
            .chars()
            .filter(|c| c.is_alphanumeric())
            .collect();
        
        let bytes = my_str.as_bytes();
        let len = bytes.len();
        if len <= 0 {
            return true;
        }
        let mut final_cursor = len-1;
        for i in 0..len/2{
            if bytes[i] != bytes[final_cursor]{ return false};
            final_cursor = final_cursor - 1;
        }   

        
        return  true;
    }
}