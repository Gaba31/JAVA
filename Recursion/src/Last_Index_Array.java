import java.util.Scanner;

public class Last_Index_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];


        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }


        int element = sc.nextInt();

        int Last = Last_Index(arr,0,element);
        System.out.println(Last);
    }

    public static int Last_Index(int [] arr , int idx , int element)
    {
        if(idx == arr.length)
        {
            return -1;
        }
        int ans = Last_Index(arr , idx+1 , element);
        if(arr[arr.length - 1] == element)
        {
            return idx;
        }
        else
        {
            return ans;
        }
    }
}


