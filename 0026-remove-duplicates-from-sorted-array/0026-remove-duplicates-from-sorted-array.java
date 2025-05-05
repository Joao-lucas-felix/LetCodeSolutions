class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[k] = nums[i];
                k++;

            }
            if(i+1 <= nums.length-1){
               if(nums[i+1] == nums[i]){
                   continue;
               }else{
                   nums[k] = nums[i+1];
                   k++;
               }
            }
        }
        return  k;
    }
}