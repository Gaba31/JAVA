import java.util.* ;

public class BarChart{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max = 0;

        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

        for(int floor = max ; floor > 0 ; floor --)
        {
            for(int i=0;i<arr.length;i++)
            {
                      if(arr[i]>=floor)
                {
                        System.out.print("*\t");
                }
                    else
                    {
                        System.out.print("\t");
                    }

            }
            System.out.println();
        }



    }
}