package PracCode;

import java.util.Scanner;

public class ADP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while (t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            for (int s : a) {
                System.out.println(s);
            }
        }
    }
}
