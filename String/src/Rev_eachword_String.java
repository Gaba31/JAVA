import java.util.*;

public class Rev_eachword_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch!=' '){
                sb.append(ch);

            }
           else{
               sb.reverse();
               ans += sb;
               ans += " ";
               sb.delete(0,str.length());
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
