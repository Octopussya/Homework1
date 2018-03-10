import java.lang.Object;
import java.util.Scanner;
import java.util.ArrayList;

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
            Sorter sort = new Sorter();
            n += sort.sort(matrix.get(i), forw);
        }
         
        System.out.println("Получившаяся матрица");
        Print print = new Print();
        print.printMatrix(matrix);
        System.out.println("Amoumt of itterations = "+ n);
    }
}
