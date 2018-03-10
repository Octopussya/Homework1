import java.util.ArrayList;
class Print
{
    public void printMatrix(ArrayList<ArrayList<Integer>> matrix)
    {
        for(ArrayList<Integer> s : matrix)// вывод 
        {
            for(Integer num : s)
            {
                System.out.format("%d ", num);
            }
            System.out.format("\n");
        }
    }
}
