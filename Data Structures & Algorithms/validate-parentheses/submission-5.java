class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Case 1: there is an opener -> add to stack
        // Case 2: there is a closer with an opener -> pop stack if close matches opener
        // Case 3: there is a closer without an opener -> output false
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);

            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
        
            }else if(!stack.isEmpty() && (current == ')' || current == ']' || current == '}')){

                if(current == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }else{
                        return false;
                    }
                }

                if(current == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }else{
                        return false;
                    }
                }

                if(current == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }else{
                return false;
            }

        }

        return stack.isEmpty();
    }
}
