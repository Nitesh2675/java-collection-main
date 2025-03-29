package com.bridgelabz.queueinterface;
import java.util.LinkedList;
import java.util.Queue;


class Stack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        // Move all elements from q1 to q2
     /*   while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Add new element to q1
        q1.add(x);

        // Move all elements back from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        */
      int size=q1.size();
      q1.add(x);
      while(size-->0){
          q1.add(q1.poll());
      }
    }

    // Pop operation
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    // Top operation
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top Element: " + stack.top()); // Output: 3
        System.out.println("Popped: " + stack.pop()); // Output: 3
        System.out.println("Popped: " + stack.pop()); // Output: 2
        System.out.println("Popped: " + stack.pop()); // Output: 1
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}
