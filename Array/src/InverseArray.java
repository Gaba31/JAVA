import java.util.*;

public class InverseArray{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int [] inverseArray = new int[n];
        for(int i = 0; i< arr.length; i++)
        {
            int temp = arr[i];

//            arr[i] = temp;
            inverseArray[temp] = i;


        }

        for(int t= 0 ;t<inverseArray.length;t++)
        {
            System.out.println(inverseArray[t]);
        }
    }

}