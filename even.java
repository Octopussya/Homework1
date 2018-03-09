import java.util.Random;

class Even
{
    public static void main(String[] args)
    {
        int arr[] = new int[7];
        Random random = new Random();
        for( int i = 0; i < 7; i++)
        {
            arr[i] = 2 * random.nextInt() % 65536; //делим чтобы число было поменьше
        }
        for(int i = 0; i < 7; i++)
        {
            if(i%2 != 0)
            {
                arr[i] = arr[i] * arr[i-1];
            }
        }
        for(int i = 0; i < 7; i++)
        {
            System.out.println(arr[i]);
        } 
    }
}
