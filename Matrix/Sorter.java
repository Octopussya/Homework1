import java.util.ArrayList;
class Sorter
{
    public static int sort(ArrayList<Integer> list, boolean forward) //сортировка строк
    {
        int iter = 0;
        for(int j = 0; j < list.size() - 1; j++)
        {
            for(int i = 0; i < list.size() - 1; i++)
            {
                if(forward ? list.get(i) > list.get(i+1) : list.get(i) < list.get(i+1))
                {    
                    int a = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1, a);
                    iter += 1;
                }
            }
        }
        return iter;
    } 
}
