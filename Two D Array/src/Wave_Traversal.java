import java.util.*;
public class Wave_Traversal {
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
        for(int j = 0 ; j<arr1[0].length ;j++)
        {
            if(j%2!=0)
            {
                for(int i = arr1.length-1 ; i >= 0 ;i--)
                {
                    System.out.println(arr1[i][j]);
                }
            }
            else
            {
                for(int i = 0 ; i< arr1.length ;i++)
                {
                    System.out.println(arr1[i][j]);
                }
            }
        }
    }
}
