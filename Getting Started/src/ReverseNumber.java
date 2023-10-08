import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            int t = n % 10;
            System.out.println(t);
            n = n / 10;
        }
    }
}