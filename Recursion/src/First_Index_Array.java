import java.util.Scanner;

public class First_Index_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];


        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }


        int element = sc.nextInt();


        int index = First_Index(arr,0,element);
        System.out.println(index);
    }

    public static int First_Index(int [] arr ,  int idx , int element)
    {
        if(idx == arr.length)
        {
            return -1;
        }

        int ans = First_Index(arr , idx + 1 , element);
        if( arr[idx] == element)
        {
            return idx;
        }
        else
        {
            return ans;
        }

    }
}
