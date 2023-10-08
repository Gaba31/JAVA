import java.util.*;

public class SubsetOfArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int limit = (int) Math.pow(2, arr.length);

        for (int i = 0; i < limit; i++) {
            int temp = i;
            String subset = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;  // Use temp here instead of i

                if (r == 0) {
                    subset = "-\t" + subset;
                } else {
                    subset = arr[j] + "\t" + subset;
                }
            }
            System.out.println(subset); // Move this line outside of the inner loop
        }
    }
}
