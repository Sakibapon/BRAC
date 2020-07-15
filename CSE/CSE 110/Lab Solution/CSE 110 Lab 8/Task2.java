import java.util.Scanner;
    public class Task2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int [] a = new int[10];
        System.out.println("please enter input");
        for(int c=0;c<=a.length-1;c++)
        {
           
            a[c]=sc.nextInt();
            }
        System.out.println("please enter the number to show");
        int x=sc.nextInt();
        System.out.println("a["+x+"]");
      }
}

    