
import java.util.*;
public class Task3{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        try{
            int test, num=scanner.nextInt();
            int array[]=new int[num];
            array[5] = 99;
            test = num/0;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Sorry");
        }

        catch(ArrayIndexOutOfBoundsException r)
        {
            System.out.println("000");
        }

    }
}

