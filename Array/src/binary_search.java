import java.util.*;

public class binary_search{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int i = 0;
        int j = arr.length-1;

        while(i<=j)
        {
            int m = (i+j)/2;
            if(element>arr[m])
            {
                i = m+1;
            }
            else if(element<arr[m])
            {
                j = m-1;
            }
            else
            {
                System.out.println(m);
                return ;
            }
        }

        System.out.println(-1);
    }

}