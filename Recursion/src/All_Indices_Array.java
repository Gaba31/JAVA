import java.util.Scanner;

public class All_Indices_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int element = sc.nextInt();

        int[] ans = allIndices(arr, element, 0, 0);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
 // total will cal total no of element
    public static int[] allIndices(int[] arr, int element, int idx, int total) {
       if(idx == arr.length){
           return new int [total];
       }

        int[] iarr;

        if(arr[idx] == element)
       {
           iarr = allIndices(arr,element,idx+1,total+1);
           iarr[total] = idx;
       }
       else
       {
           iarr = allIndices(arr,element,idx+1,total);

       }
       return iarr;
   }

}