package CodeChefSTART80D;

import java.util.Scanner;

public class SINGLEUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int c = 0;
            if(Y>X)
            {
                H=H-Y;
                if(H%X!=0) {
                    c=1;
                }
                c += H/X+1;
            }
            else {
                if(H%X!=0) {
                    c = 1;
                }
                c += H/X;
            }
            System.out.println(c);
        }
    }
}