import static java.lang.System.*;
import java.util.*;
public class Task24
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        out.println("Please enter a number");
        int midnum=sc.nextInt();
        for (int count=1; count<2*midnum; count++)
        {
            if (count<=midnum)
            {
                out.print(count);
            }
            else
            {
                int x=(2*midnum-count);
                out.print(x);
            }
        }
        out.println();
    }
}