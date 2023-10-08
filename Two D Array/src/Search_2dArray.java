import java.util.Scanner;

public class Search_2dArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        int[][] arr1 = new int[n1][m1];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int number = sc.nextInt();

//        for(int i = 0; i<arr1.length;i++)
//        {
//            for(int j = 0 ; j<arr1[i].length ; j++)
//            {
//                if(number == arr1[i][j])
//                {
//                    System.out.println(i+","+j);
//                    return ;
//
//                }
//            }
//        }

        int i = 0;
        int j = arr1[2].length-1;
        while(i< arr1.length && j>=0)
            {
                if(number == arr1[i][j])
                {
                    System.out.println(i+","+j);
                    return;

                }

               else if(number<arr1[i][j])
                {
                    j--;
                }
                else
                {
                    i++;
                }

            }

        System.out.println("Invalid");
    }
}
