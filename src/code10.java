import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome :");
         a= sc.nextInt();
        System.out.println(isPalindrome(a));
    }
   public static boolean isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(temp!=0){
            int l=temp%10;
            rev =rev*10+l;
            temp=temp/10;
        }
        return rev==n;
    }
}
