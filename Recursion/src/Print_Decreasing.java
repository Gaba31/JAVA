import java.util.Scanner;

public class Print_Decreasing {
    public static void PDec(int n){
        if(n==0)return;
        System.out.println(n);
        PDec(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PDec(n);
    }
}
