import java.util.*;
public class Rotateby90degree {

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
        int [][] arr2 = new int [n1][m1];
        for(int j = arr2[1].length -1 , l = 0 ; j >= 0 ;j--,l++)
        {
            int k = 0;
            for(int i = 0 ; i<arr2.length ;i++)
            {
                arr2[i][j] = arr1[l][k];
                k++;
            }

        }

        for(int i = 0; i< arr2.length ; i++)
        {
            for(int j = 0 ; j<arr2[0].length; j++)
            {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }


    }

    }

