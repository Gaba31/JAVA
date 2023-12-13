import java.util.*;

public class length_of_last_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.trim().split("\\s+");
        System.out.println(arr[arr.length - 1].length());

        int count = 0;
        for(int i = str.length()-1 ; i>=0; i--){
            char ch = str.charAt(i);

          if(ch == ' '){
              continue;
          }
          else {
              count++;
          }
        }
        System.out.println(count);
    }
}
