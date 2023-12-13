import java.util.*;
public class Reverse_String {
    public static void main(String[] args) {
        // Reverse String using StringBuilder
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());

        int i = 0;
        int j = str.length()-1;
        while(i<j){
            char a = str.charAt(i);
            char b = str.charAt(j);

            str.setCharAt(i,b);
            str.setCharAt(j,a);

            i++;
            j--;

        }
        System.out.println(str);
    }
}
