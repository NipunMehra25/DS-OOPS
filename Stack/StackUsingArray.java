public class StackUsingArray {

    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public StackUsingArray(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop element.");
            return -1;
        }
        return stackArray[top--];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}
