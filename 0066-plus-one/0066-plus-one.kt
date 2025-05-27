class Solution {
    fun plusOne(digits: IntArray): IntArray {
        return plus(digits, digits.size-1)
    }
    private fun plus(digits: IntArray, index: Int=0): IntArray{
        if (digits[index] == 9  && index != 0){
            digits[index] = 0
            return plus(digits, index-1)
        }else if (digits[index] ==  9 && index ==0){
            val newDigits: IntArray = IntArray(digits.size + 1)
            newDigits[0] = 1
            return newDigits
        }
        else {
            digits[index] += 1
            return digits
        }
    }
}