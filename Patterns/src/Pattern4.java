
import java.util.*;
public class Pattern4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = n;    // for star
        int space = 1;

        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<space;k++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++)
            {
                System.out.print("*\t");
            }
            str--;
            space++;
            System.out.println();
        }
    }
}
