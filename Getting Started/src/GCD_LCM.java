import java.util.Scanner;

public class GCD_LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //Entering two numbers
        int n2 = sc.nextInt();
        int on1=n1; // storing orignal n1
        int on2=n2;

        while(n1%n2!=0)
        {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int GCD=n2;
        int LCM=(on1*on2)/GCD;
        System.out.println(LCM);
        System.out.println(GCD);

        }
    }

