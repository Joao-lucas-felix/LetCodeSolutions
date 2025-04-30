class Solution {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        if (charArray.length <= 1) return false;
        List<Character> stack = new ArrayList<>();
        boolean isValid = false;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case '(' -> {
                    stack.addFirst('(');
                }
                case '{' -> {
                    stack.addFirst('{');
                }
                case '[' -> {
                    stack.addFirst('[');
                }


                case ')' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.removeFirst() != '(') return false;
                }
                case '}' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.removeFirst() != '{') return  false;
                }
                case ']' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.removeFirst() != '[') return false;
                }

            }
        }
        return stack.isEmpty();
    }
}