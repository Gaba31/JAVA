import java.util.*;
public class MystringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        // append
        s.append(" world");
        System.out.println(s);

        // setCharAt
        s.setCharAt(0,'N');
        System.out.println(s);

        // insert
        s.insert(2,'y');
        System.out.println(s);


        //deleteCharAt
        s.deleteCharAt(2);
        System.out.println(s);
    }
}
