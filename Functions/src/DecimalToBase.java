import java.util.*;
public class DecimalToBase {

    public static int getDeciToBase(int n,int b)
    {
        int rv=0;
        int P=1;
        while(n>0)
        {
            int t = n%b;
            n = n/b;
            rv += t*P;
            P = P*10;

        }
        return rv;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // No in decimal
        int base = sc.nextInt();
        int ans = getDeciToBase(n,base);
        System.out.println(ans);

    }
}
