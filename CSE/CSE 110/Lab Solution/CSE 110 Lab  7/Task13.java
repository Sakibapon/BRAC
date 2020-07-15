import static java.lang.System.*;
import java.util.*;
public class Task13
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(in);
        out.println("Please enter a number");
        int input=sc.nextInt();
        
        for (int count=1; count<=input; count++)
        {
            for (int space=1; space<=(input-count); space++)
            {
                out.print(" ");
            }
            for (int num=1; num<(2*count); num++)
            {
                out.print(num);
            }
            out.println();
        }
        for (int count=input-1; count>0; count--)
        {
            for (int space=1; space<=(input-count); space++)
            {
                out.print(" ");
            }
            for (int num=1; num<(2*count); num++)
            {
                out.print(num);
            }
            out.println();
        }
    }
}