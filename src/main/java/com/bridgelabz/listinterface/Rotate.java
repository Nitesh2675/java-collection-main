package com.bridgelabz.listinterface;

import java.util.*;

public class Rotate{
    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;

        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, n));
        rotated.addAll(list.subList(0, k));

        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        List<Integer> rotatedList = rotateList(numbers, rotateBy);
        System.out.println(rotatedList); // Output: [30, 40, 50, 10, 20]
    }
}

