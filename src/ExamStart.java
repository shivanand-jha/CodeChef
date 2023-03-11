package CodeChefSTART80D;

import java.util.Scanner;

public class ExamStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            if(x-24>0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
