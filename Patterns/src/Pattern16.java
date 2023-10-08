import java.util.*;
public class Pattern16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2*n-3;
        int p=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            if(i==n)
            {
               p=i-1;
            }
            else
            {
                p=i;
            }
            for(int j=p;j>=1;j--)
            {

                System.out.print(j+"\t");
            }
            space-=2;

            System.out.println();
        }
    }
}
