import java.util.*;

public class Upper_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
//        System.out.println(s);

        for(int i = 0 ; i<s.length(); i++){
            boolean flag = true;
            char ch = s.charAt(i);
            if(ch == ' ' || ch>=0)  continue;
            int ascii = (int)ch;
            if(ascii >= 97) flag = false;
            if(flag == true){
                 ascii += 32;
                 char dh = (char)ascii;
                 s.setCharAt(i,dh);
            }
            else{
                ascii -= 32;
                char dh = (char)ascii;
                s.setCharAt(i,dh);
            }
        }
        System.out.println(s);

    }
}
