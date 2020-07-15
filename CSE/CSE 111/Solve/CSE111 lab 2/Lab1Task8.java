import java.util.Scanner;
public class Lab1Problem8
{
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of rows");
        int row=input.nextInt();
        System.out.println("please enter the number of columns");
        int column=input.nextInt();
        for(int rowCount=1;rowCount<=row;rowCount++)
        {
            for(int number=1;number<=column;number++)
            {
                if (rowCount==1 || rowCount==row)
                {
                    System.out.print(number);
                }
            else if(number==1 || number==column)
            {
                System.out.print(number);
            }
            else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
        input.close();
    }
}
