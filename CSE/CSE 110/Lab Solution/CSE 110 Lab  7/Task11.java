import java.util.*;
public class Task11
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the line no. ");
        int target=sc.nextInt();
        
        for (int line=0; line<target; line++)
        {
            for (int space=1; space<(target-line); space++)
            {
                System.out.print(" ");
            }
            for (int num=target-line; num<=target; num++)
            {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}