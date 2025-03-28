package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedList {
    public static void main(String[] args){
        Set <Integer> set =new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of set elements:");
        int n = sc.nextInt();

        System.out.println("Enter set elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        Set <Integer> sorted=new TreeSet<>(set);
        System.out.println("original set "+set);
        System.out.println("sorted set "+sorted);

    }
}
