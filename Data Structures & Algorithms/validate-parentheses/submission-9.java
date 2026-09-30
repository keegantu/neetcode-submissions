class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);

            if(cur == '(' || cur == '[' || cur == '{'){
                stack.push(cur);

            }else if(cur == ')'){
                if(stack.peek() != null && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(cur == ']'){
                if(stack.peek() != null && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(cur == '}'){
                if(stack.peek() != null && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

// Scenarios
// ( [ {: just push to stack
// ) ] }: if no opener, return false but if opener pop
