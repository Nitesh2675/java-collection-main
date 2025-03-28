package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionAndInterface {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        System.out.println("enter size of set1 elemets");
        int n=sc.nextInt();
        System.out.println("enter size of set2 elemets");
        int m=sc.nextInt();

        System.out.println("enter set1 elements");
        for(int i=0;i<n;i++){
            set1.add(sc.nextInt());

        }
        System.out.println("enter set2 elements");

        for(int i=0;i<m;i++){
            set2.add(sc.nextInt());

        }
        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);


        Set<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union of sets: " + union);
        System.out.println("Intersection of sets: " + intersection);

    }
}
