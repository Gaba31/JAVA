import java.util.*;
public class Basics_Hashmap {
    public static void main(String[] args) {
        // Syntax
        Map<String, Integer> mp = new HashMap<>();
        // Adding ELements
        mp.put("Aakash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);

        // Getting values of a key from the Hashmap
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Rahul")); //null

        // Changing/updating value of a key in the Hashmap
        mp.put("Aakash",20); // Aakash -> 20

        // Remove pair from the Hashmap
        mp.remove("Aakash");
        System.out.println(mp.get("Aakash")); // null

        // Checking if a key is in the Map
        System.out.println(mp.containsKey("Aakash")); // false
        System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key doesn't exist already

        // one way
        //if(!mp.containsKey("Yash")) mp.put("Yash" , 30);

        // another way
        mp.putIfAbsent("Yash",30); // will not enter
        mp.putIfAbsent("Yashika",25); // will enter

        // Get all keys in the map
        System.out.println(mp.keySet());

        // Get all values in the Hashmap
        System.out.println(mp.values());

        // Get all entries in the Hashmap
        System.out.println(mp.entrySet());

        //  Traversing all entries of Hashmap - multiple methods

//        for(String key : mp.keySet()){
//            System.out.printf("Age of %s is %d\n",key , mp.get(key));
//        }
//
//        for (Map.Entry<String,Integer> e : mp.entrySet() ){
//            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
//        }

        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}