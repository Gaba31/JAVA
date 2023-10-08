import java.util.*;
public class Pattern17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str =1;
        int space =n/2;

        for (int i = 1; i <= n; i++) {

            for(int k=1;k<=space;k++)
            {
                if(n/2+1==i)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }

            for(int j=1;j<=str;j++)
            {

                System.out.print("*\t");
            }

            if(i<=n/2)
            {
                str++;
            }
            else {
                str--;
            }
            System.out.println();
        }
    }
}
