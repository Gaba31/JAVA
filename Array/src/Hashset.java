import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // search -- contains
        if(!set.contains(4)){
            System.out.println("does not contain 4");
        }

        // delete
        set.remove(1);

        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }

        // size
        System.out.println(set.size());

        // print
//        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        // hasnext , next function

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
