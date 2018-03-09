import java.lang.Object;
import java.util.Scanner;
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
class Matrix
{
    public static void main(String[] args)
    {
        int n = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        System.out.println("Введите матрицу(чтобы закончить ввод нажмите клавишу Enter и потом ctrl+D)");
        while(in.hasNextLine())
        {
            String s = in.nextLine();//считываем строки
            String strs[] = s.split(" ");
            ArrayList<Integer> num = new ArrayList<Integer>();
            for(String str : strs)
            {
                num.add(Integer.parseInt(str));
            }
            matrix.add(num);//считываем числа в строках
        }
        for(int i = 0; i < matrix.size(); i++)// четная или нечетная строка + сортировка
        {
            boolean forw = i%2 != 0;
            n += Sorter.sort(matrix.get(i), forw);
        }
         
        System.out.println("Получившаяся матрица");
        for(ArrayList<Integer> s : matrix)// вывод 
        {
            for(Integer num : s)
            {
                System.out.format("%d ", num);
            }
            System.out.format("\n");
        }
        System.out.println("Amoumt of itterations = "+ n);
    }
}
