/*Task 4
Run your solution of Task3 and give 2.5 as input. It will cause error.
Now you see that it is hard to know every error that may occur in advance. Hence, modify your solution 
to Task 3 to account for all other unknown errors that can be caused from any line of the main method. 
*/

import java.util.*;
public class Task04{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        try{
            int test,num = scanner.nextInt();
            int[] array = new int[num];
            array[5]=99;
            test = num/0;
        }

        catch(ArithmeticException a)
        {
            System.out.println("Sorry");
        }

        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("000");
        }

        catch(Exception aa){
            System.out.println("Sorry");
        }
    }
}
