import java.util.*;
public class Saddle_Point {
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
        int min = arr1[0][0];
        for(int i = 0 ; i< arr1.length ; i++)
        {
            int k = i;
            for(int j = i+1 ; j< arr1[1].length ; j++)
            {
                    if(min>arr1[i][j])
                    {
                        min = arr1[i][j];
                    }
            }

            for(    ; k< arr1.length ; k++)
            {
//                if(min>)
            }

            }

    }
}
