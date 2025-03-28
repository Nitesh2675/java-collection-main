package com.bridgelabz.queueinterface;

import java.util.PriorityQueue;
import java.util.Comparator;


class Patient{
    String name;
    int severnity;

    public Patient(String name, int severnity) {
        this.name = name;
        this.severnity = severnity;
    }
}

public class HospitalTriage {
    public static void main(String[] args){
        PriorityQueue<Patient> q=new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o2.severnity-o1.severnity;     //max HEAP
            }
        });

        q.add(new Patient("Alice",5));
        q.add(new Patient("John",3));
        q.add(new Patient("Bob",2));

        while(!q.isEmpty()){
            System.out.println(q.remove().name);
        }

    }

}
