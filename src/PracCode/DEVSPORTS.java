package PracCode;

import java.util.Scanner;

public class DEVSPORTS

{
public static void main (String[] args) throws java.lang.Exception
        {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int s=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(n-x>=s+y+z)
        System.out.println("YES");
        else
        System.out.println("NO");
        t--;
        }
    }
}