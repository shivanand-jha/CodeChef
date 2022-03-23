package practice_Questions;

import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Lcm(a,b));
    }
    public static int Lcm(int x ,int y)
    {
        int res = Math.max(x,y);
        while (true)
        {
            if(res%x==0 && res%y==0)
            {
                return res;
            }
            res++;
        }
    }
}
