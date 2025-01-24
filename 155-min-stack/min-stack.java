class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(stack.size()==0){
            stack.push(val);
            min.push(val);
            return;
        }
        stack.push(val);
        int temp=Math.min(val,min.peek());
        min.push(temp);
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */