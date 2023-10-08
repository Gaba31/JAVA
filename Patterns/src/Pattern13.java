import java.util.*;
public class Pattern13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int icj=1;  // ncr of starting and ending value is 1 .

            for(int j=0;j<=i;j++) // here we are doing j<=i bcoz we have to print i+1 value in each column.
            {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i-j)/(j+1);
                icj = icjp1;

            }
            System.out.println();
        }
    }
}
