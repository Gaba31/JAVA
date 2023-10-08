import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of t");
        int t=sc.nextInt();




        for(int j=0;j<t;j++)
        {
            System.out.println("Enter a nubmer");
            int n=sc.nextInt();
            int count=0;
            for(int div=2;div*div<=n;div++)
            {
                if(n%div==0)
                {
                    count++;
                    break;
                }
            }

            if(count==0)
            {
                System.out.println(n + " is  a prime number");
            }
            else {
                System.out.println(n + " is  a prime number");
            }
        }

    }
}
