class Solution {
    fun lengthOfLastWord(s: String): Int {
        val l = s.trim().split(" ")
        return l[l.size-1].length
    }
}