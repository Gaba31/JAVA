import java.util.*;

public class Factorial{

    public static int Fact(int n)
    {
        int f=1;
        while(n>0)
        {
            f=f*n;
            n--;
        }
        return f;
    }
    public static  void display(int a)
    {
//
        System.out.println(a);
    }

    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = Fact(n);
            display(ans);
        }
        }