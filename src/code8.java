public class code8 {
    public static void main(String[] args) {
        System.out.println(countDig(12354563));
    }
    public static int countDigit(long n)
    {
        int count =0;
        while (n>0)
        {
            n=n/10;
            ++count;
        }
        return count;
    }

  public static   int countDig(long n)
    {
        if(n==0)
            return 0;
        else
            return 1+countDig(n/10);
    }
}
