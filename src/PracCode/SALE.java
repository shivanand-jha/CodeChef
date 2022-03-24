package PracCode;

import java.util.Scanner;

public class SALE {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int o=sc.nextInt();
            int a =Math.min(m , n);
            int b=Math.min(n,o);
            System.out.println(m+n+o-Math.min(a,b));
            t--;

        }
    }
}
