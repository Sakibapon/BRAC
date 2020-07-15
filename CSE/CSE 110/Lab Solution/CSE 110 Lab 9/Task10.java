import java.util.Scanner;
public class Task10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double n = sc.nextDouble();
       System.out.println("Current output is "+n);
        System.out.printf("Desired output after the change is %.4f\p",n);
    }
}
        