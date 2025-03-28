package com.bridgelabz.setinterface;

import java.util.TreeSet;
import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter size of set1 elements:");
        int n = sc.nextInt();
        System.out.println("Enter size of set2 elements:");
        int m = sc.nextInt();

        System.out.println("Enter set1 elements:");
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        System.out.println("Enter set2 elements:");
        for (int i = 0; i < m; i++) {
            set2.add(sc.nextInt());
        }
        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection =new TreeSet<>(set1);
        intersection.retainAll(set2);

        Set <Integer> symmetricDifference= new TreeSet<>(union);
        symmetricDifference.removeAll(intersection);

        System.out.print("Sysmmetric differnece"+symmetricDifference);



    }
}
