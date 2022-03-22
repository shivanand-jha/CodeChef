import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        int f , d, l;
        Scanner sc = new Scanner(System.in);
        System.out.println("first term");
        f= sc.nextInt();
        System.out.println("enter the common difference");
        d= sc.nextInt();
        System.out.println("Enter the last term ");
        l=sc.nextInt();
        System.out.println("THE AP SERIES IS :");
        for (int i = f; i <=l; i=i+d) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("THE GP SERIES IS :");
        for (int i = f; i <=l ; i=i*d) {
            System.out.print(i+" ");
        }
    }
//    public static int[] AP(int f, int d ,int l)
//    {
//        int s=0;
//        for (int i = f; i <=l ; i=i+d) {
//            s=i;
//        }
//        return i
//    }

}
