class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> min;

    public MinStack() {
        stack = new ArrayDeque<>();
        min = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else{
            min.push(Math.min(val, min.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
