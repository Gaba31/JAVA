import java.util.*;

public class First_Last_Index{

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
        int li = 0;

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
                li = m;
                i = m + 1;
            }
        }

         i = 0;
         j = arr.length-1;
        int fi = 0;
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
                fi = m;
                j = m - 1;
            }
        }

        System.out.println(fi);
        System.out.println(li);
    }

}