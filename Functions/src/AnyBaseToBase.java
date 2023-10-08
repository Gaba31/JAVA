import java.util.*;
public class AnyBaseToBase {

   public static int BaseToBase(int n,int b1,int b2)
   {
       int d = getBaseToDeci(n,b1);
       int d1 = getDeciToBase(d,b2);
       return d1;
   }
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
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        int ans = BaseToBase(n,base1,base2);
        System.out.println(ans);

    }
}
