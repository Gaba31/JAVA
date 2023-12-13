import java.util.*;

public class isogram_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char mh = 0;
        boolean flag = false;
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(j) == str.charAt(i)){
                    mh = str.charAt(j);
                    break;
                }
            }

            if(mh == ch){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}
