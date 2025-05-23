class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var i =  nums.binarySearch(target)
        if (i >= 0) return  i
        if (target < nums[0]) return 0
        val len = nums.size / 2
        if (nums[len] > target){
            for( x in 0..len){
              if( target < nums[x + 1]){
                  return x+1
              }
            }
        }else {
            for( x in len..nums.size){
                if (x+1 >= nums.size) return  nums.size
                if( target < nums[x+1]){
                    return x+1
                }
            }
        }

        return nums.size
    }
}