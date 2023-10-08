import java.util.*;
public class AnyBaseSubtraction {

    public static int Subtraction(int base ,int n1,int n2)
    {
//        int count =0;


        int rv = 0;
        int p =1;
        int sub =0;
        int carry = 0;
        while(n2>0)
        {
            int d1 = n1%10;
            int d2 = n2%10;
            n1=n1/10;
            n2=n2/10;

            int d = 0;
            d2 = d2 + carry;

            if(d2>=d1)
            {
                carry=0;
                d = d2 - d1 ;
            }
            else
            {
                carry = -1;
                d = d2 + base - d1;
            }

//            if(d1<d2)
//            {
//                d1+=base;
//                n1 = n1-1;
//            }
//            sub = d1-d2;
            rv = rv + d * p;
            p = p*10;


        }
        return rv;
    }
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner (System.in);

        int base=sc.nextInt();
        int n1=sc.nextInt();   // Given n2 is greater than n1
        int n2=sc.nextInt();
        int ans = Subtraction(base,n1,n2);
        System.out.println(ans);

    }
}
