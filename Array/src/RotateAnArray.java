import java.util.* ;

public class RotateAnArray {

    public static void reverse(int i,int j,int []arr)
    {


        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

    public static void rotate(int []arr , int k )
    {
        k=k%arr.length;

        if(k<0)
        {
            k = k + arr.length;
        }
                //part 1
            reverse(0 , arr.length-k-1,arr);

            //part 2
           reverse(arr.length-k,arr.length-1,arr);

            //part 3
            reverse(0,arr.length-1,arr);


            for(int i = 0 ;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();


        rotate(arr,k);

    }
}