import java.util.Scanner;
public class Lab03_0Task3
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a[]=new int [10];
        for(int count=0;count<a.length;count++)
        {
            System.out.println("please enter a number");
            a[count]=input.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            int index=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[index])
                    index=j;
            }
            int largerNumber=a[index];
            a[index]=a[i];
            a[i]=largerNumber;
        }
        for(int m=0;m<a.length;m++)
        {
            System.out.print(a[m]+" ");
        }
        input.close();
    }
}




            