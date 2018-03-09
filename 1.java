import java.util.ArrayList;
import java.util.Scanner;

class Div3and2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt())
        {
            Numbers.add(in.nextInt());
        }    
        for(int i = 0; i < Numbers.size(); i++)
        {
            if(Numbers.get(i)%2 == 0 && Numbers.get(i)%3 == 0)
            {
                System.out.println(Numbers.get(i));
            }
        }

    }
}

