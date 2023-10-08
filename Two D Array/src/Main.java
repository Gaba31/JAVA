import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        int[][] arr1 = new int[n1][m1];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int minr = 0 ;
        int minc = 0;
        int maxr = arr1.length - 1;
        int maxc = arr1[0].length-1;
        int c = 0;
        int t = n1*m1;

        while(c<t)
        {
            // lft walll
            for(int i = minr , j = minc ; i<=maxr  && c<t; i++)
            {
                System.out.println(arr1[i][j]);
                c++;
            }

            minc++;

            // bottom wall

            for(int j = minc , i = maxr ; j<=maxc && c<t; j++)
            {
                System.out.println(arr1[i][j]);
                c++;
            }

            maxr--;

            // right wall

            for(int i = maxr , j = maxc ; i>=minr && c<t ; i--)
            {
                System.out.println(arr1[i][j]);
                c++;
            }

            maxc--;

            // top  wall

            for(int i = minr , j = maxc ; j>=minc && c<t ; j--)
            {
                System.out.println(arr1[i][j]);
                c++;
            }

            minr++;


}
        }
}