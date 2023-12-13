import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char [] arr = new char[10];   String are  basically character array

        // Declaration
//        String str = "College Sallah";
//        System.out.println(str);


        // Taking Input
//        String str = sc.next();
//        String str = sc.nextLine();
//        System.out.println(str);


        // Length function and charAt()
//        String str = "Hello World";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));


        // indexOf()
//        String str = "Hello";
//        int index = str.indexOf('o');
//        System.out.println(index);


        // compareTo
//        String str = "Cello";
//        String gtr = "Dello";
//        System.out.println(str.compareTo(gtr));


        //contains() , startsWith() and endsWith()
//        String str = "Physics Wallah";
//        System.out.println(str.contains("alla"));
//        System.out.println(str.startsWith("Phy"));
//        System.out.println(str.endsWith("ah"));


        //toLowerCase() , toUpperCase()
//        String str = "Physics Wallah";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());


        //concat()
//        String s1 = "abc";
//        String s2 = "def";
//        String s3 = s1.concat(s2);
//        System.out.println(s3);


        // String + int/char/string
//        String str = "abc";
//        str += "xyz";
//        str += 'r';
//        str += 10;
//        System.out.println(str);

//        System.out.println("abc"+10+20);
//        System.out.println(10+20+"abc");


        // substring(i,j) and substring(i);
//        String str = "abcde";
//        System.out.println(str.substring(0,2));
//        System.out.println(str.substring(0));


        // Interning
        String s = "Hello";
        String x = "Hello";
        x = "Mello";
        System.out.println(s);
    }
}
