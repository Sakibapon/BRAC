import static java.lang.System.*;
import java.util.*;
public class Task20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        out.println("Please enter the line no.");
        int line=sc.nextInt();
        for (int linecount=1; linecount<=line; linecount++)
        {
            for (int space=1; space<=(line-linecount); space++)
            {
                out.print(" ");
            }
            if (linecount==1)
            {
                out.print("*");
            }
            else if (linecount==line)
            {
                for (int star=1; star<(2*linecount); star++)
                {
                    out.print("*");
                }
            }
            else
            {
                for (int count=1; count<(2*linecount); count++)
                {
                    if (count==1)
                    {
                        out.print("*");
                    }
                    else if (count==(2*linecount-1))
                    {
                        out.print("*");
                    }
                    else
                    {
                        out.print(" ");
                    }
                }
            }
            out.println();            
        }
    }
}
                
            