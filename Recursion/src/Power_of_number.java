import java.util.Scanner;

public class Power_of_number {

    public static int power (int x ,int n)
    {
        if(n==0) return 1;
        int P = power(x,n-1);
        int ans = x * P;
        return ans;
    }
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans  =  power(x,n);
        System.out.println(ans);

    }

}
