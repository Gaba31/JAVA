import java.util.Scanner;

public class PDI {
    public static void Pdi(int n)
    {
        if(n==0) {
            return ;
        } 
        System.out.println(n);
        Pdi(n-1);
        System.out.println(n);



    }

    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pdi(n);

    }


}

