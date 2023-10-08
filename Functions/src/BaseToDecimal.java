import java.util.*;
public class BaseToDecimal {

    public static int getBaseToDeci(int n,int b)
    {
        int rv=0;
        int P=1;
        while(n>0)
        {
            int t = n%10;
            n = n/10;
            rv += t*P;
            P = P*b;

        }
        return rv;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // No in decimal
        int base = sc.nextInt();
        int ans = getBaseToDeci(n,base);
        System.out.println(ans);

    }
}
