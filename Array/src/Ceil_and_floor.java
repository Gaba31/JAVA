import java.util.*;

public class Ceil_and_floor{

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
        int ceil = 0;
        int floor = 0;

        while(i<=j)
        {
            int m = (i+j)/2;
            if(element>arr[m])
            {
                i = m+1;
                floor = arr[m];
            }
            else if(element<arr[m])
            {
                j = m-1;
                ceil = arr[m];
            }
            else
            {
                ceil = arr[m];
                floor = arr[m];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

}