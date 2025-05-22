class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val iter: IntIterator = nums.iterator()
        var count = 0
        while(iter.hasNext()){
            val next = iter.next()
            if (next != `val`){
                nums[count] = next
                count += 1;
            }
        }
        return count;
    }
}