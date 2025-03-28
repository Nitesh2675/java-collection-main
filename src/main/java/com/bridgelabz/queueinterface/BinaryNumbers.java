package com.bridgelabz.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
    public static void main(String[] args) {
        int N = 10; // Example input
        generateBinaryNumbers(N);
    }

    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String front = queue.remove();
            System.out.print(front + " "); // Print instead of storing

            // Enqueue next binary numbers
            queue.add(front + "0");
            queue.add(front + "1");
        }
    }
}
