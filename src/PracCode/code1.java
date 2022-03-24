package PracCode;

import java.util.Scanner;

public class code1 {


        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                //  SELF DEF Problem
                int n=sc.nextInt();
                int count=0;
                while(n>0)
                {
                    int s=sc.nextInt();
                    if(s>=10 && s<=60 )
                        count++;
                    n--;
                }
                System.out.println(count);
                t--;
            }
        }
    }


