

import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //  country--key and population(value);
        HashMap<String ,  Integer> map = new HashMap<>();

        //Insertion
        map.put("India" , 90);
        map.put("US"  , 100);
        map.put("China",10);

        System.out.println(map);

        map.put("China" , 180);
        System.out.println(map);

        // Search
        if(map.containsKey("China"))
        {
            System.out.println("key  contains");
        }
        else {
            System.out.println("key does not contains");
        }
        // get
        System.out.println(map.get("China")); // key exist
        System.out.println(map.get("Africa")); // key does not exist

        // for loop in map
//        Map.Entry<String , Integer> e : map.entrySet();
        for(Map.Entry<String , Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // remove
        map.remove("China");
        System.out.println(map);
    }
}
