package PracCode;

import java.util.Scanner;

public class CHEFRACES {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int count=0;
            if(a!=c && a!=d)
            {
                count++;
            }
            if(b!=c && b!=d)
            {
                count++;
            }
            System.out.println(count);
            t--;
        }

    }
}
