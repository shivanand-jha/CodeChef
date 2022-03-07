import java.util.Scanner;

public class code6 {
    public static void main (String[] args)
    {       //https://www.codechef.com/problems/CCISLAND

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {int a,b,c,d,e;
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            d= sc.nextInt();
            e= sc.nextInt();
            if(c*e<=a && d*e<=b)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }

}
