import java.util.Random;

class Even
{
    public static void main(String[] args)
    {
        int arr[] = new int[7];
        Random random = new Random();
        System.out.format("Исходный массив:");
        for( int i = 0; i < 7; i++)
        {
            arr[i] = 2 * random.nextInt(200) - 100; //делим чтобы число было поменьше
            System.out.format("%d ", arr[i]);
        }
        System.out.format("\n"); 

        System.out.format("Получившийся массив:");
        for(int i = 0; i < 7; i++)
        {
            if(i%2 != 0)
            {
                arr[i] = arr[i] * arr[i-1];
            }
        }
        for(int i = 0; i < 7; i++)
        {
            System.out.format("%d ", arr[i]);
        } 
    }
}
