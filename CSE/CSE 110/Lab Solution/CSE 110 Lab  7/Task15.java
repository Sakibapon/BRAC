import java.util.*;
public class Task15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the line no.");
        int line=sc.nextInt();
        System.out.println("Please enter the columnno.");
        int column=sc.nextInt();
        
        for (int templine=1; templine<=line; templine++)
        {
            if (templine==1)
            {
                for (int star=1; star<=column; star++)
                {
                    System.out.print(star);
                }
            }
            else if (templine==line)
            {
                for (int star=1; star<=column; star++)
                {
                    System.out.print(star);
                }
            }                
            else
            {
                for (int count=1; count<=column; count++)
                {
                if (count==1)
                {
                    System.out.print(count);
                }
                else if(count==column)
                {
                    System.out.print(count);
                }
                else
                {
                    System.out.print(" ");
                }
                }
            }
            System.out.println();
        }
                    
    }
}