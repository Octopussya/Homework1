import java.lang.Object;
import java.util.Scanner;
import java.util.ArrayList;

class Array
{
    
    static int sort(ArrayList<Integer> list, boolean forward) //сортировка строк
    {
        int iter = 0;
        if(forward == true)//сортировка по возрастанпию
        {
            for(int j = 0; j < list.size() - 1; j++)
            {
                for(int i = 0; i < list.size() - 1; i++)
                {
                    if(list.get(i) > list.get(i+1))
                    {    
                        int  A = list.get(i);
                        list.set(i,list.get(i+1));
                        list.set(i+1, A);
                        iter += 1;
                    }
                }
            }
        }
    
        else //сортировка по убыванию
        {
            for(int j = 0; j < list.size() - 1; j++)
            {
                for(int i = 0; i < list.size() - 1; i++)
                {
                    if(list.get(i) < list.get(i+1))
                    {
                        int A = list.get(i+1);
                        list.set(i+1,list.get(i));
                        list.set(i,A);
                        iter += 1;
                    }
                }
            }    
        }
        return iter;
    }    
    public static void main(String[] args)
    {
        int n = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> Matrix = new ArrayList<ArrayList<Integer>>();
        while(in.hasNextLine())
        {
            String S = in.nextLine();//считываем строки
            String strS[] = S.split(" ");
            ArrayList<Integer> Num = new ArrayList<Integer>();
            for(String Str : strS)
            {
                Num.add(Integer.parseInt(Str));
            }
            Matrix.add(Num);//считываем числа в строках
        }
        for(int i = 0; i < Matrix.size(); i++)// четная или нечетная строка + сортировка
        {
            boolean forw;
            if(i%2 != 0)
            {
                forw = true;
            }
            else
            {
                forw = false;
            }
            n += sort(Matrix.get(i), forw);
        }

        for(ArrayList<Integer> S : Matrix)// вывод 
        {
            for(Integer Num : S)
            {
                System.out.format("%d ", Num);
            }
            System.out.format("\n");
        }
        System.out.println("Amoumt of itterations = "+ n);
    }
}
