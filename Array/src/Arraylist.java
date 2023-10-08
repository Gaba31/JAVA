import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>();

        // add elements

        list.add(0);
        list.add(2);

        System.out.println(list);

        // get elements

        int element = list.get(1);
        System.out.println(element);

        // add  elment  in bw

        list.add(1,1);
        System.out.println(list);

        // set elements

        list.set(0,5);
        System.out.println(list);

        // delete element
        list.remove(2);
        System.out.println(list);

        // size of list
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i = 0 ; i < list.size() ; i++)
        {
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
