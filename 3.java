import java.util.Scanner;

class Sum
{
    static int sum (int N)
    {
        if(N < 10)
        {
            return N;
        }
        return N%10 + sum(N/10);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(sum(N));
    }
}
