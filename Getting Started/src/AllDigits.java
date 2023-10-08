import java.util.Scanner;

public class AllDigits {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
//        int count =0;
//        while(n!=0)
//        {
//            count++;
//            n=n/10;
//        }
//        int power=count; // for simplicity...
//
//        int newtemp=temp;
//
//        for(int i=1;temp!=0;i++)
//        {
//
//            int h=(int)(Math.pow(10,power-i));
//            int t = newtemp/h;
//            int p=t%10;
//            System.out.println(p);
//            temp=temp/10;
//        }

        // Another Approach..

        int nod=0; // No of digits

        while(temp!=0)
        {
            temp=temp/10;
            nod++;
        }


        int div=(int)(Math.pow(10,nod-1));
        while(div!=0)
        {
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;
        }

    }
}
