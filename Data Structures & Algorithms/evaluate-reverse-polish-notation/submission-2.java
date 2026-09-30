class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < tokens.length; i++){
            String cur = tokens[i];

            if(!((tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")))){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                if(tokens[i].equals("+")){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y+x);
                }

                if(tokens[i].equals("-")){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y-x);
                }

                if(tokens[i].equals("*")){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y*x);
                }

                if(tokens[i].equals("/")){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y/x);
                }
            }
        }

        return stack.pop();

    }
}


