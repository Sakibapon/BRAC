import java.util.*;
public class Task9
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the line no.");
            int target=sc.nextInt();
        
        for (int line=1; line<=target; line++)
        {
            for( int space=1; space<=target-line; space++)
            {
                System.out.print(" ");
            }
            for ( int star=1; star<(2*line); star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
            