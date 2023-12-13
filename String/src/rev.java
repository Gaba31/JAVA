import java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder sb = new StringBuilder("");
        str.reverse();
        System.out.println(str);
        String ans = "";
        for(int i = 0; i<str.length() ; i++){
            char ch = str.charAt(i);

            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
