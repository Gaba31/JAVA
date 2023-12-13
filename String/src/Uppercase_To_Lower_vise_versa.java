import java.util.*;

public class Uppercase_To_Lower_vise_versa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            boolean flag = true;
            if(ch == ' '){
                continue;
            }
            if(ascii >= 97){
                flag = false;
            }

            if(flag!=true){
                ascii -= 32;
                ch = (char)ascii;
                str.setCharAt(i,ch);
            }
            else{
                ascii += 32;
                ch = (char)ascii;
                str.setCharAt(i,ch);
            }
        }
        System.out.println(str);
    }
}
