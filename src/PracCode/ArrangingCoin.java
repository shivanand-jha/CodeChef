package PracCode;

import java.util.Scanner;

public class ArrangingCoin {
    public static int arrangeCoins(int n) {
        int count=0;
        int a=0;
        for(int i=1;i<=n;i++)
        {
            a=i+a;
            count++;
            if(a>n)
                return count-1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(arrangeCoins(n));
    }
}
