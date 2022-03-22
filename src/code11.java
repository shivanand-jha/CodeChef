public class code11 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(10));//method call
        System.out.println(effectiveTrailingZero(10));
    }
    public static int trailingZeroes(int n)//single parameter method
    {
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;//factorial
        }
        System.out.println(fact);
        int res=0;
        while(fact%10==0)//while fact is greater or equal to zero
        {
            res++;//incr value
            fact /=10;//decr in size by a single digit;
        }
        return res;//return the value
    }
    public static int effectiveTrailingZero(int n)
    {
        int res=0;
        for (int i = 5; i <= n; i=i*5) {
            res=res+n/i;
        }
        return res;

    }
}
