package Q4;

class Stack {
    private Object[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new Object[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public void push(Object item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return stackArray[top--];
    }
}

public class TestStack {
    public static void main(String[] args) {
        // Test the Stack class with different data types
        Stack stack = new Stack(5);

        // Pushing different types of elements
        stack.push(10); // Integer
        stack.push("Hello"); // String
        stack.push(3.14); // Double
        stack.push(true); // Boolean

        // Popping elements and printing
        System.out.println(stack.pop()); // true
        System.out.println(stack.pop()); // 3.14
        System.out.println(stack.pop()); // Hello
        System.out.println(stack.pop()); // 10

        // Trying to pop when stack is empty
        System.out.println(stack.pop()); // Stack Underflow
    }
}
