import java.util.Scanner;
public class Lab1Problem10
{
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row=input.nextInt();
        int value=row;
        
        for(int rowCount=1;rowCount<=row;rowCount++)
        {
            for(int space=1;space<=row-rowCount;space++)
            {
                System.out.print(" ");
            }
            for(int number=value;number<=row;number++)
            {
                if(number==value || number==row)
                {
                    System.out.print(number);
                }
                else if(rowCount==row)
                {
                    System.out.print(number);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            value--;
        }
        input.close();
    }
}

