import java.util.Scanner;

public class Print_Increasing {
    public static void Pincr(int n){
        if(n==0)return;
        Pincr(n-1);
        System.out.println(n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pincr(n);
    }
}
