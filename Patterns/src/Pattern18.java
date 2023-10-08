import java.util.*;
public class Pattern18{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str =n;
        int space =0;


        for (int i = 1; i <= n; i++) {

            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }

            for(int j=1;j<=str;j++)
            {
                if(i>1 && i<=n/2 && j>1 && j<str)
                {
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            if(i<=n/2)
            {
                str-=2;
                space++;
            }
            else
            {
                str+=2;
                space--;
            }

            System.out.println();
        }
    }
}
