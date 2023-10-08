import java.util.Scanner;

public class Max_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

       int  ans =  Max_Array(arr,0);
        System.out.println(ans);

    }

    public static int Max_Array(int []arr,int idx)
    {
        if(idx == arr.length - 1)
        {
            return arr[idx];
        }
        int element = Max_Array(arr,idx+1);
        if(element < arr[idx])
        {
            return arr[idx];
        }
        else {
            return element;
    }

    }
}
