import java.util.* ;

public class SpanOfArray{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int diff = 0;

        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

        diff = max - min;

        System.out.println(diff);
    }
}