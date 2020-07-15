import java.util.Scanner;
public class Lab1Problem9
{
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number rows");
        int row=input.nextInt();
        
        for(int rowCount=1;rowCount<=row;rowCount++)
        {
            for(int number=1;number<=rowCount;number++)
            {
                if((number==1)||(number==rowCount))
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
        }
        input.close();
    }
}
