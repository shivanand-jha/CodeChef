import java.util.Scanner;

public class code3 {
    public static void main (String[] args)
    {
        Scanner sc;
        sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int x3=sc.nextInt();
            int x4=sc.nextInt();
            if(x1+x3==180 && x2+x4==180)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
