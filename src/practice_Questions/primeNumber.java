package practice_Questions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(Prime(n))
            System.out.println("The number is Prime ");
        else
            System.out.println("The number is not a Prime ");
    }
    public static boolean Prime(int x)
    {
        if(x==1)
            return false;
        if(x%2==0 || x%3==0)
            return false;
        for (int i = 5; i*i <=x ; i +=6) {
            if(x%i==0 || x%(i+2)==0)
                return false;
        }
        return true;
    }
}
