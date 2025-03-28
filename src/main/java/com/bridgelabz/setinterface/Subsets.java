package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Subsets {
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
        Set <Integer> subset=new TreeSet<>(set1);
        subset.retainAll(set2);

        System.out.println(subset);
        if(!subset.isEmpty()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
