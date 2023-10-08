import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no of disks
        int tower_1 = sc.nextInt();
        int tower_2 = sc.nextInt();
        int tower_3 = sc.nextInt();
        toh(n,tower_1,tower_2,tower_3);
    }

    public static void toh(int n , int t1 ,int t2 , int t3)
    {
        if(n==0) return;
        toh(n-1,t1,t3,t2);
        System.out.println(n + "[" + t1 + " -> "  + t2 + "]");
//        System.out.println("Disk " + n + " moved from " +  t1  + " to " + t2);
        toh(n-1,t3,t2,t1);
    }
}
