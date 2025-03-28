package com.bridgelabz.listinterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Nthelement {
    public static void main(String[] args){
        List<String> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of list");
        int n=sc.nextInt();
        System.out.print("Enter list elements");
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.print("Enter nth elements");
        int m=sc.nextInt();

       // System.out.print(list.get(0));
        int k=n-m;
        String res=null;
        for(int i=0;i<=k;i++){
           res=list.get(i);
        }
        System.out.print(res);
    }
}
