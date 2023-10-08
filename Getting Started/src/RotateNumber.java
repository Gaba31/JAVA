import java.util.Scanner;

public class RotateNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int temp=n;

        while(n>0)
        {
            count++;
            n=n/10;
        }

        int t=0;

        if(k<0)
        {

          t = k + count;
        }
        else
        {
            t = k;
        }

        int output=0;
        int power=count-1;
        for(int i=1;i<=t;i++)
        {
            int remainder = temp%10;
            temp=temp/10;
            int m = (int)(Math.pow(10,power));
            output = temp + (remainder*m);
            temp=output;

        }

        System.out.println(output);

    }
}