package org.example;
import  java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        LinkedHashMap<String, String> hash = new LinkedHashMap<>();

        hash.put("name", "Yousma");
        hash.put("age", "22");
        hash.put("field", "SQA");


    //First way of iterating
        /*Iterator<String> it =  hash.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key + " : "+hash.get(key));
        }*/

        //Second way of iterating
        for(Map.Entry<String, String> entry : hash.entrySet()){
            System.out.println(entry.getKey()+ " :" + entry.getValue());
        }

        }
    }
