package com.bridgelabz.map;

import java.util.HashMap;
import java.util.Map;

public class HighestValue {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        String highestKey=null;
        int highestvalue=Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry:map.entrySet()){
           if(entry.getValue()>highestvalue){
               highestvalue=entry.getValue();
               highestKey= entry.getKey();
           }
        }
        System.out.println("Key with highest value: " + highestKey);
        System.out.println("Highest value: " + highestvalue);
    }
}
