import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        String str1 = str.replaceAll("\\s+", "");
        String str2 = new StringBuffer(str1).reverse().toString();
        if(str1.equals(str2))
        {
            System.out.println("Palindrome");
        }    
        else
        {
            
            System.out.println("Not a palindrome");
        }

    }
}

