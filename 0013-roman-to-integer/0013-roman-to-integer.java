class Solution {
    public int romanToInt(String s) {
         int[] nums = s.chars().mapToObj(i -> (char) i).mapToInt(value -> {
                return switch (value) {
                    case 'I' -> 1;
                    case 'V' -> 5;
                    case 'X' -> 10;
                    case 'L' -> 50;
                    case 'C' -> 100;
                    case 'D' -> 500;
                    case 'M' -> 1000;
                    default -> 0;
                };
         }).toArray();

         int sum = 0;
         boolean passProx = false;
         for (int i = 0; i < nums.length; i++) {
                if (!passProx){
                    if (nums[i] != 1 && nums[i] != 10 &&nums[i] != 100) sum += nums[i];
                    if (nums[i] == 1 ) {
                        if (i + 1 < nums.length){
                            if (nums[i+1] == 5){
                                sum += 4;
                                passProx = true;
                            }else if (nums[i+1] == 10){
                                sum += 9;
                                passProx = true;
                            }else{
                                sum += nums[i];
                            }
                            continue;
                        }
                        sum += nums[i];

                     }
                    if (nums[i] == 10 ) {
                        if (i + 1 < nums.length){
                            if (nums[i+1] == 50){
                                sum += 40;
                                passProx = true;
                            }else if (nums[i+1] == 100){
                                sum += 90;
                                passProx = true;
                            }else {
                                sum += nums[i];

                            }
                            continue;
                        }
                        sum += nums[i];

                    }
                    if (nums[i] == 100 ) {
                        if (i + 1 < nums.length){
                            if (nums[i+1] == 500){
                                sum += 400;
                                passProx = true;
                            }else if (nums[i+1] == 1000){
                                sum += 900;
                                passProx = true;
                            }else {
                                sum += nums[i];
                            }
                            continue;
                        }
                        sum += nums[i];
                    }
                } else {
                    passProx = false;
                }
         }
         return sum;
    }
}