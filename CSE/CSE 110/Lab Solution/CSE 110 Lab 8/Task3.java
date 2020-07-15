import java.util.Scanner;
    public class lab8task3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int [] a = new int[10];
        System.out.println("please enter input");
        for(int c=0;c<=a.length-1;++c)
        {
            
            a[c]=sc.nextInt();
            }
        for(int i=a.length-1;i>=0;--i)
        {
          System.out.println(i);
        }
    }
    }
    
    

    