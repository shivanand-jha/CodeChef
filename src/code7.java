import java.util.Scanner;

public class code7 {
    public static void main (String[] args)
    {       //https://www.codechef.com/problems/DRUNKALK
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a= sc.nextInt();
            if(a%2==0)
                System.out.println(a);
            else
                System.out.println(a+2);
            t--;
        }
    }
}
