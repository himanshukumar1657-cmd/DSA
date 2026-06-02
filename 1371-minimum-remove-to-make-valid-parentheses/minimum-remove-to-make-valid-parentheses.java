class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        Set<Integer> invalid = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);  

            if (ch == '(') {       
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    invalid.add(i);
                }
            }
        }

        while (!stack.isEmpty()) {
            invalid.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!invalid.contains(i)) {
                sb.append(s.charAt(i)); 
            }
        }

        return sb.toString();
    }
}