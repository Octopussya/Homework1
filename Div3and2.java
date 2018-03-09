class Div3and2
{
    public static void main(String[] args)
    {    
        int[] Numbers = {1, 2, 3, 12, 6};
        for(int i = 0; i < 5; i++)
        {
            if(Numbers[i]%2 == 0 && Numbers[i]%3 == 0)
            {
                System.out.println(Numbers[i]);
            }
        }

    }
}

