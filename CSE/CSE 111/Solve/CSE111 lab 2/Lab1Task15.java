import java.util.Scanner;
public class Lab1Problem15
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        int n=input.nextInt();
        for(int v=1;v<=n;v++){
            System.out.print("*");
        }
        input.close();
    }
}






