import java.util.Scanner;

public class code4 {

    //FACE DIRECTION
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            switch (n % 4) {
                case 1 -> System.out.println("EAST");
                case 2 -> System.out.println("SOUTH");
                case 3 -> System.out.println("WEST");
                default -> System.out.println("NORTH");
            }
            t--;
        }
    }
}
