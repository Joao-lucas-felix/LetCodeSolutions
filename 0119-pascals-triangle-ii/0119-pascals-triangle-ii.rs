impl Solution {
    pub fn get_row(row_index: i32) -> Vec<i32> {
        fn generate(n_rows: i32) -> Vec<Vec<i32>> { 
            if n_rows <= 0 {
                return  vec![vec![]];
            }

            let mut result: Vec<Vec<i32>> = vec![vec![1]]; 

            for i in 1..n_rows { 
                
                let mut line: Vec<i32> = vec![1,1];

                for j in 1..(i) { 
                    match result.get((i-1) as usize) {
                        None => (), 
                        Some(vec) => {
                            let first = match vec.get((j - 1) as usize) {
                                None => 0,
                                Some(v) => v.clone(),
                            };

                            let second = match vec.get((j) as usize) {
                                None => 0, 
                                Some(v) => v.clone(),
                            };

                            let element = first + second;
                            line.insert(j as usize, element);
                        },   
                    }
                }
                
                result.insert(i as usize, line);

            }
            return  result;
        }
        return match generate(row_index + 1).get((row_index) as usize) {
            None => vec![1], 
            Some(vec) => vec.clone(),
        };
    }

   
}