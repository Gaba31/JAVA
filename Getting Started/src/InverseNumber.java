import java.util.Scanner;

public class InverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        int i=1;

       while(temp>0)
       {
           int t=temp%10;
           int m=(int)(Math.pow(10,t-1));
           sum=sum+(i*m);
           temp=temp/10;
           i++;
       }

       System.out.println(sum);


    }
}