class MinStack {
    class Node {
        int val;
        int min;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    Node head;
    public MinStack() {
        this.head = null;
    }
    
    public void push(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.min = val;
        } else {
            newNode.min = head.min > newNode.val ? newNode.val : head.min;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
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