class Solution {
    public boolean isValid(String s) {
        char next;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            next = s.charAt(i);
            switch (next) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.empty() || stack.pop() != s.charAt(i)) {
                        return false;
                    }
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return true;
    }
}
