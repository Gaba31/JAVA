import java.util.*;
public class DigitFrequency {
    public static int getdigitFrequency(int n,int digit)
    {
        int count = 0;
        while(n!=0)
        {
            int t = n%10;
            if(t == digit)
            {
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();

        int frequency = getdigitFrequency(n,digit);

        System.out.println(frequency);

    }
}
