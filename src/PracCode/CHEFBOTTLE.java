package PracCode;

import java.util.Scanner;

public class CHEFBOTTLE {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            int a=Math.min(n,k/x);
            System.out.println(a);
            t--;
        }
    }
}
