import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        displayR(arr,0);
    }
    public static void displayR(int [] arr , int idx)
    {
        if(idx == arr.length)
        {
            return;
        }

            displayR(arr,idx+1);
            System.out.println(arr[idx]);
    }
}
