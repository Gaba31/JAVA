import java.util.*;
public class AllPrime {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int h=sc.nextInt();

        for(        ;l<=h;l++)
        {
            if (l <= 1) {
                continue; // Skip 1 and non-positive numbers
            }
            int count=0;
            for(int div=2;div*div<=l;div++)
            {

                if(l%div==0)
                {
                    count++;
                    break;
                }
            }

            if(count==0)
            {
                System.out.println(l + " is  a prime number");
            }        }
    }
}
