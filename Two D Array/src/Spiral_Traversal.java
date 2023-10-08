import java.util.*;
public class Spiral_Traversal {
    public static void main(String args[]) {
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
        int minc = 0 ;
        int maxr = arr1.length -1 ;
        int maxc = arr1[0].length-1;
        int t = n1*m1;
        int count = 0;

        while (count < t)
        {
            // left wall
            for(int i = minr , j = minc ; i<=maxr && count<t ;i++)
            {
                System.out.println(arr1[i][j]);
                count++;
            }
            minc++;

            // bottom wall

            for(int i = maxr , j = minc ; j<=maxc && count<t ; j++)
            {
                System.out.println(arr1[i][j]);
                count++;
            }

            maxr--;
            //  right wall

            for(int i = maxr , j = maxc ; i>=minr && count<t ; i--)
            {
                System.out.println(arr1[i][j]);
                count++;
            }

            maxc--;

            // top  wall

            for(int i = minr , j = maxc ; j>=minc && count<t ; j--)
            {
                System.out.println(arr1[i][j]);
                count++;
            }

            minr++;

        }


    }
}
