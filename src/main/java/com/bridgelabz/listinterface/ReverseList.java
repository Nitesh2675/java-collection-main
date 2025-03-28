package com.bridgelabz.listinterface;
import java.util.*;



    public class ReverseList {
        // Method to reverse an ArrayList
        public static <T> List<T> reverseArrayList(List<T> list) {
            List<T> reversedList = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                reversedList.add(list.get(i));
            }
            return reversedList;
        }

        // Method to reverse a LinkedList
        public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
            LinkedList<T> reversedList = new LinkedList<>();
            for (T item : list) {
                reversedList.addFirst(item); // Adds to the front, reversing order
            }
            return reversedList;
        }

        public static void main(String[] args) {
            List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

            System.out.println("Original ArrayList: " + arrayList);
            System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));

            System.out.println("Original LinkedList: " + linkedList);
            System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));
        }
    }


