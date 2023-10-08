import java.util.Scanner;

public class Power_of_number_Logarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = Power(x,n);
        System.out.println(ans);
    }

    public static int Power(int x , int n)
    {
        if(n==0) return 1;

        int xnb2 = Power(x,n/2);
        int ans = xnb2 * xnb2;

        if(n%2==1)
        {
            ans = ans * x;
        }
        return ans;
    }
}
