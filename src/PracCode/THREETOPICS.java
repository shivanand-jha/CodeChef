package PracCode;

import java.util.Scanner;

public class THREETOPICS {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=sc.nextInt();
        if(x==a || x==b || x==c)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
