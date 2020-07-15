import static java.lang.System.*;
import java.util.*;
public class Task19
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        out.println("Please enter the line number");
        int line=sc.nextInt();
        for (int linecount=0; linecount<line; linecount++)
        {
            for (int space=1; space<(line-linecount); space++)
            {
                out.print(" ");     
            }
                
            if (linecount==0)
            {
                out.print(line);
            }
            else if (linecount==1)
            {
                for (int star=(line-linecount); star<=line; star++)
                {
                    out.print(star);
                }
            }
            else if (linecount==(line-1))
            {
                for (int star=(line-linecount); star<=line; star++)
                {
                    out.print(star);
                }
            }
            else
            {
                for (int count=(line-linecount); count<=line; count++)
                {
                    if (count==line-linecount)
                    {
                        out.print(count);
                    }
                    else if (count==line)
                    {
                        out.print(count);
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