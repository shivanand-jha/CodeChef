package PracCode;

import java.util.Scanner;

public class INCRIQ {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n+7>170)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
