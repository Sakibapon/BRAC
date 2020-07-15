import java.util.Scanner;
public class Lab2Task9
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a[]=new int [10];
        for(int count=0;count<a.length;count++)
        {
            System.out.println("Please enter number");
            a[count]=input.nextInt();
        }
        for(int v=0;v<a.length;v++)
        {
            int small=a[v];
            int smallLocation=v;
            for(int c=v+1;c<a.length;c++)
            {
                if (a[c]<small)
                {
                    small=a[c];
                    smallLocation=c;
                }
            }
            int temp=a[v];
            a[v]=a[smallLocation];
            a[smallLocation]=temp;
        }
        for(int count=0;count<a.length;count++)
        {
            if (a[count]%2==1)
            {
                System.out.print(a[count]+" ");
            }
        }
        for(int count=0;count<a.length;count++)
        {
            if (a[count]%2==0)
            {
                System.out.print(a[count]+" ");
            }
        }
        input.close();
    }
}




