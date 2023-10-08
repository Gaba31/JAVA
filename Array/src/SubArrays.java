import java.util.*;

public class SubArrays {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int k = 0 ; k<arr.length;k++)
        {
            for(int i = k ; i<arr.length;i++)
            {
                for(int j = k ; j <= i ; j++)
                {
                    System.out.print(arr[j]);
                    System.out.print("\t");
                }
                System.out.println();
            }
        }

    }
}