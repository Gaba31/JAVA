import java.util.*;
public class Diagonal_Traversal {
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
        for(int gap = 0 ; gap< arr1.length ; gap++){
            for(int i = 0 ,  j = gap ; j<arr1.length ; j++)
            {
                System.out.println(arr1[i][j]);
                i++;

            }
        }
    }
}
