package PracCode;

import java.util.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class HDIVISR
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=10; i>=1;i--)
        {
            if(t%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}