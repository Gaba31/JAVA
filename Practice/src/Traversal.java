import java.util.Scanner;

public class Traversal {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int [n][m];

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j<matrix[1].length ; j++){
                matrix[n][m] = sc.nextInt();
            }
        }

        int  minr = 0;
        int maxr = matrix.length;
        int minc = 0;
        int maxc= matrix[1].length;
        int t = n*m;
        int count = 0;

        while(count < t)
        {
            // top side

            for(int i = minr , j = minc ; j < matrix[1].length  && count<t; j++)
            {
                System.out.println(matrix[i][j]);
                count++;
            }
            minr++;

            for(int i = minr , j = maxc ; i<matrix.length && count<t ; i++)
            {
                System.out.println(matrix[i][j]);
                count++;
            }
            maxc--;

            for(int i = maxr , j = maxc ; j>=minc && count<t ; j--)
            {
                System.out.println(matrix[i][j]);
                count++;
            }

            maxr--;

            for(int i = maxr , j = minc ; i>=minr && count<t ; i++)
            {
                System.out.println(matrix[i][j]);
                count++;
            }
        }
    }
}
