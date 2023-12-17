import java.util.Scanner;

public class All_Indices_Array {

    public static int [] all_indice(int []arr , int d , int i , int fsf){
        if(arr.length == i){
            return new int[fsf];
        }

        if(arr[i] == d){
            int ans [] = all_indice(arr,d,i+1,fsf+1);
            ans[fsf] = i;
            return ans;
        }
        else{
            int ans [] = all_indice(arr,d,i+1,fsf);
            return ans;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

      int [] ans = all_indice(arr,d,0,0);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }


    }
}

