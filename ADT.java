import java.util.*;

public class ADT {
    //implement a stack class using an array
    //keep array and top index private
    //provide push(), pop(),top()
    //push 10 and 20 and then print top()

    static class Stack {
        private int[] arr;
        private int top;
        // Constructor
        public Stack(int size) {
            arr = new int[size];
            top = -1;
        }
        // Push element
        public void push(int value) {
            if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = value;
        }
        // Pop element
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }
        // Return top element
        public int top() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[top];
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.top());
    }
}

