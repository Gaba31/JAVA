import java.util.*;
public class AnyBaseAddition {

public static int Addition(int base ,int n1,int n2)
   {
       int count =0;
       int rv = 0;
       int p =1;
       while(n1>0 || n2>0 || count>0)
       {
           int d1 = n1%10;
           int d2 = n2%10;
           n1 = n1/10;
           n2 = n2/10;

           int d =  d1 + d2 + count;
           count = d/base;
            d = d%base;

           rv = rv + d *p;
           p = p*10;


       }
       return rv;
   }
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner (System.in);

        int base=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans = Addition(base,n1,n2);
        System.out.println(ans);

    }
}
