import java.util.*;
public class Print_All_Palindromic_String {
    public static void solution(String s){
        for(int i = 0 ; i < s.length() ; i++) {
            for(int j = i+1 ; j<=s.length() ; j++){
                String ss = s.substring(i,j);
                if(isPalindrome(ss)==true)
                {
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPalindrome(String ss)
    {
        int i = 0;
        int j = ss.length()-1;

        while(i<=j) {
            char ch1 = ss.charAt(i);
            char ch2 = ss.charAt(j);

            if(ch1!=ch2)
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        solution(s);


    }
}
