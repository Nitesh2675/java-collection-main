package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class CheckEqual {
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
            if(set1.equals(set2)){
                System.out.print("true");
            }
            else{
                System.out.print("false");

            }

        }
    }


