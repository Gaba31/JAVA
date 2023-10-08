import java.util.Scanner;

public class Exit_Point {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        int[][] arr1 = new int[n1][m1];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int direction  = 0;
        int i = 0;
        int j = 0;

        while(true)
        {
            if(arr1[i][j]==1)
            {
                i++;

            }
//            else if()
        }
    }
}
