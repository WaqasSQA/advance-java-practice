package hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key +" : "+value );
        }

        //Using iterator

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key +" : "+value );
        }
    }
}
