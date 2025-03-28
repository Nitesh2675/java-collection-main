package com.bridgelabz.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Original Queue: " + q);

        reverseUsingAuxiliaryQueue(q);

        System.out.println("Reversed Queue: " + q);

        System.out.print("Reversed queue "+ reversed(q) );
    }


    public static Queue<Integer> reversed(Queue<Integer> q) {
        if (q.isEmpty()) {
            return q;
        }

        // Step 1: Remove the front element
        int front = q.remove();

        // Step 2: Reverse the rest of the queue
        Queue<Integer> reversedQueue = reversed(q);

        // Step 3: Add the removed element back at the end
        reversedQueue.add(front);

        return reversedQueue;
    }


    public static void reverseUsingAuxiliaryQueue(Queue<Integer> q) {
        Queue<Integer> tempQueue = new LinkedList<>();

        while (!q.isEmpty()) {
            int front = q.remove();

            // Insert element at the front of tempQueue (trick: reinsert everything)
            int size = tempQueue.size();
            tempQueue.add(front);
            for (int i = 0; i < size; i++) {
                tempQueue.add(tempQueue.remove());
            }
        }

        // Transfer back to original queue
        while (!tempQueue.isEmpty()) {
            q.add(tempQueue.remove());
        }
    }
}
