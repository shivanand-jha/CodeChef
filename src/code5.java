import java.util.Scanner;

public class code5 {
    public static void main (String[] args)
    {
        // https://www.codechef.com/problems/CHFRICH
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a,b,x;
            a= sc.nextInt();
            b= sc.nextInt();
            x= sc.nextInt();
            System.out.println((b-a)/x);
            t--;
        }
    }
}
