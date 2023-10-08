import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 =sc.nextInt();
        int n3=sc.nextInt();
        int H=0;
        int P=0;
        int  B=0;
        if(n1>n2)
        {
            if(n1>n3)
            {
                H = n1;
                P = n2;
                B = n3;
            }
            else
            {
                H=n3;
                P=n1;
                B=n2;

            }
        }
        else if(n2>n3)
        {
            H=n2;
            P=n1;
            B=n3;
        }
        else
        {
            H=n3;
            P=n1;
            B=n2;

        }

        if((H*H)==(P*P)+(B*B))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
}