package com.bridgelabz.map;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class Invert {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);


        HashMap<Integer,List<String>> invertedMap=new HashMap<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            Integer value=entry.getValue();
            String key =entry.getKey();

          if(!invertedMap.containsKey(value)){
              invertedMap.put(value,new ArrayList<>());
          }
          invertedMap.get(value).add(key);

        }
        System.out.println(invertedMap);
    }
}
