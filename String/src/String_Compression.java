import java.util.*;
public class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        int count = 0;
        String ans = "" + str.charAt(0);
        char prev = str.charAt(0);
        for(int i = 0 ; i<str.length() ; i++){
            char curr =  str.charAt(i);
            if(curr == prev){
                count++;
            }
            else{
                ans+=count;
                ans+=curr;
                count = 0;
                prev = curr;
            }

        }
        System.out.println(ans);
    }
}
