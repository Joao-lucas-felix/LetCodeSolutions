class Solution {
fun addBinary(a: String, b: String): String {
        val num1 = a.split("").filter { it.isNotEmpty() }.map { it.toInt() }
        val num2 = b.split("").filter { it.isNotEmpty() }.map { it.toInt() }

        val maxlen = maxOf(num1.size, num2.size)
        val acc = IntArray(maxlen + 1)

        val paddedNum1 = List(maxlen - num1.size) { 0 } + num1
        val paddedNum2 = List(maxlen - num2.size) { 0 } + num2

        sumBinary(paddedNum1, paddedNum2, acc, maxlen - 1, acc.size - 1, false)

        val result = acc.joinToString("").trimStart('0')
        return result.ifEmpty { "0" }
    }

    fun sumBinary(
        num1: List<Int>, num2: List<Int>, acc: IntArray,
        index: Int, accIndex: Int,
        plusOne: Boolean
    ):IntArray {
        if (index < 0 ){
            if (plusOne) {
                acc[accIndex] = 1
            }
            return acc
        }
        val digit1 = num1[index]
        val digit2 = num2[index]
        val sum = digit1 + digit2 + if(plusOne) 1 else 0
        acc[accIndex] = sum % 2
        val newPlusOne = sum >= 2
        return sumBinary(num1, num2, acc , index-1, accIndex-1, newPlusOne)
    }
}