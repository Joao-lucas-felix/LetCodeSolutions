class Solution {
    fun strStr(haystack: String, needle: String): Int {
               val iter = haystack.iterator()
        var index = 0
        while (iter.hasNext()){

            if (index + needle.length <= haystack.length){
                var isEqual = true
                for (i in 0..needle.length-1){
                    if (haystack[index + i] == needle[i]){ continue }
                    isEqual = false
                }
                if(isEqual) return index;
            }
            index += 1;
            iter.next()
        }
        return  -1 
    }
}