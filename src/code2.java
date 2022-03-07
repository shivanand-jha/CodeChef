import java.util.Scanner;

public class code2 {
    public static void main (String[] args)
{
    // PASS OR FAIL
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int p=sc.nextInt();
        if((x*3-(n-x))>=p)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        t--;
    }
}
}
