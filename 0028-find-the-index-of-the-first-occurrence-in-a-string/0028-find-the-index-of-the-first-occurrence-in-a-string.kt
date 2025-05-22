class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val iter = haystack.iterator()
        var index = 0
        while (iter.hasNext()){

            if (index + needle.length <= haystack.length){
                if (needle == haystack.substring(index, index+ needle.length)) {
                    return index
                }
            }
            index += 1;
            iter.next()
        }
        return  -1
    }
}