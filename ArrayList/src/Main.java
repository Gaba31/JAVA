import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Integer j =  Integer.valueOf(4);
//        System.out.println(j);
        ArrayList<Integer>li = new ArrayList<>();

        // add elements in arraylist
        li.add(3);
        li.add(56);
        li.add(1);

        // printing with loop
//        for(int i = 0; i<li.size();i++){
//            System.out.print(li.get(i)+" ");
//        }
        // printing arraylist
        System.out.println(li);

        // getting elements
        System.out.println(li.get(2));

        // adding element to some index
        li.add(1,333);
        System.out.println(li);

        // modifying at index
        li.set(1,555);
        System.out.println(li);

        // removing element at index i
        li.remove(1);
        System.out.println(li);

        // removing with given element
       li.remove(Integer.valueOf(85));
        System.out.println(li);

        // checking if element is existed or not
        boolean ans = li.contains(Integer.valueOf(4));
        System.out.println(ans);
    }
}