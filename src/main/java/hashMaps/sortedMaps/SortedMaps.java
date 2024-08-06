package hashMaps.sortedMaps;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(linkedHashMap);
    }

    private static void testMap(Map<Integer, String> map){
        map.put(15, "Cat");
        map.put(1, "Dog");
        map.put(0, "Giraffe");
        map.put(3, "Horse");
        map.put(2, "Pony");
        map.put(20, "Cow");

        for(Integer key : map.keySet()){
            String value = map.get(key);
            System.out.println(key +" : "+ value);
        }
    }
}
