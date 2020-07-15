import static java.lang.System.*;
import java.util.*;
public class Task17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        out.println("Please enter the line number");
        int line=sc.nextInt();
        for (int linecount=1; linecount<=line; linecount++)
        {
            if (linecount==1)
            {
                out.print(linecount);
            }
            else if (linecount==2)
            {
                for (int star=1; star<=linecount; star++)
                {
                    out.print(star);
                }
            }
            else if (linecount==line)
            {
                for (int star=1; star<=linecount; star++)
                {
                    out.print(star);
                }
            }
            else
            {
                for (int count=1; count<=linecount; count++)
                {
                    if (count==1)
                    {
                        out.print(count);
                    }
                    else if (count==linecount)
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