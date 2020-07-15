import static java.lang.System.*;
import java.util.*;
public class Task25
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        out.println("Please enter a number");
        int line=sc.nextInt();
        for (int linecount=1; linecount<=line; linecount++)
        {
            for (int space=1; space<=(line-linecount); space++)
            {
                out.print(" ");
            }
            for (int num=1; num<2*linecount; num++)
            {
                if (num<=linecount)
                {
                    out.print(num);
                }
                else
                {
                    out.print(2*linecount-num);
                }
            }
            out.println();
        }
    }
}