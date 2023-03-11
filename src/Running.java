package CodeChefSTART80D;

import java.util.Scanner;

public class Running {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int c = 0;
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if(arr1[i]*2<arr2[i] ||arr1[i]>2*arr2[i] ){

                }else {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
