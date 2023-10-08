
import java.util.*;
public class Pattern5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = 1;    // for star
        int space = n/2;

        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=space;k++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++)
            {
                System.out.print("*\t");
            }
            if(i<=n/2)
            {
                str+=2;
                space--;
            }
            else
            {
                str-=2;
                space++;
            }

            System.out.println();
        }
    }
}
