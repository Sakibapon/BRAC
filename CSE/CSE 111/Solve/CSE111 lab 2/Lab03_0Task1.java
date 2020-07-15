import java.util.Scanner;
public class Lab03_0Task1
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int [] a=new int[10];
        for(int count=0;count<a.length;count++)
        {
            System.out.println("please enter a number");
            a[count]=input.nextInt();
        }
        for(int c=a.length-1;c>=0;c--)
        {
            System.out.println(a[c]);
        }
        input.close();
    }
}


