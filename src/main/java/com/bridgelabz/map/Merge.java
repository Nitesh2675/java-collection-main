package com.bridgelabz.map;

import java.util.HashMap;
import java.util.Map;

public class Merge {
    public static void main(String[] args){
        HashMap <String,Integer> map1=new HashMap<>();
        HashMap <String,Integer> map2=new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        map2.put("B",3);
        map2.put("C",4);

        for(Map.Entry<String,Integer> entry: map2.entrySet()){
            String key=entry.getKey();
            int value=entry.getValue();
            if(map1.containsKey(key)){
                map1.put(key,map1.get(key)+value);
            }else{
                map1.put(key,value);
            }

        }
        System.out.println(map1);

    }
}
