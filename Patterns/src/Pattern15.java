import java.util.*;
public class Pattern15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str=1;
        int space=n/2;
        int val=1;
        int count = 1;
        for (int i = 1; i <= n; i++)
        {

            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }

            for(int j=1;j<=str;j++)
            {
                System.out.print(count+"\t");
                if(str/2>=j) {
                    count++;
                }
                else
                {
                    count--;
                }
            }

            if(i<=n/2)
            {
                space--;
                str+=2;
                val++;
            }
            else
            {
                space++;
                str-=2;
                val--;
            }
            count=val;
            System.out.println();
        }
    }
}

