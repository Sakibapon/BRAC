import java.util.Scanner;
public class Lab1Problem3
{
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of rows");
        int row=input.nextInt();
        
        for(int rowCount=1;rowCount<=row;rowCount++)
        {
            for(int number=1;number<=rowCount;number++)
            {
                System.out.print(number);
            }
            System.out.println();
        }
        input.close();
    }
}
