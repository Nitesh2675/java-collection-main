package com.bridgelabz.map;

import java.io.*;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/bridgelabz/map/input.txt"; // Change this to your file path
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
                String[] words = line.split("\\s+"); // Split by spaces

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Print word frequencies
        System.out.println(wordCountMap);
    }
}

