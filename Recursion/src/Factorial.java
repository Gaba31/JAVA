import java.util.Scanner;

public class Factorial {
    public static int Fact(int n)
    {
        if(n==0) return 1;
        int fnm1 = Fact(n-1);
        int f = n * fnm1;

        return f;




    }

    public static void main (String args [])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans  =  Fact(n);
        System.out.println(ans);

    }


}

