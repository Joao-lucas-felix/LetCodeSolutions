class Solution {
    public boolean isPalindrome(int x) {
        var strNum = Integer.toString(x).toCharArray();
        char[] reverseNum = new char[strNum.length]; 
        var count = 0;
        for (int i = strNum.length; i > 0; i--) {
           reverseNum[count] = strNum[i - 1];
           count++;

        }
        return Arrays.equals(strNum, reverseNum);
    }
}