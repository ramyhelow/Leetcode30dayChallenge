import java.util.Stack;

public class Q10_MinStack {

    static class ListNode {
        int value;
        int min;
        ListNode next;

        ListNode(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    static class MinStack {

        ListNode head;


        /**
         * initialize your data structure here.
         */
        public MinStack() {
        }

        public void push(int x) {
            if(head==null) head = new ListNode(x,x);
            else{
                ListNode tmp = new ListNode(x,Math.min(x,head.min));
                tmp.next = head;
                head = tmp;
            }
        }

        public void pop() {
            if(head.next==null) head = null;
            else{
                head = head.next;
            }
        }

        public int top() {
            return head.value;
        }

        public int getMin() {
            return head.min;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-10);
        minStack.push(14);
        minStack.push(-20);
        minStack.push(10);
        minStack.push(-7);


        for (int i = 0; i < 5; i++) {
            System.out.println("val = "+minStack.top()+ " min = "+minStack.getMin());
            minStack.pop();
        }

    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
