public class code12
{
    public static void main(String[] args) {
        System.out.println(gcd(5 , 72));
    }
    public static int gcd(int n,int m)
    {
        int re=Math.min(n,m);
        while (re>0)
        {
            if(n%re==0 && m%re==0)
            {
                break;
            }
            re--;
        }
        return re;
    }
}
