import java.util.Scanner;
    public class Task9
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int [] a = new int[10];
        System.out.println("please enter input");
        for(int c=0;c<a.length;++c)
        {
            System.out.println("please enter input");
            a[c] = sc.nextInt();
        }
            System.out.println("please enter a number");
            int x = sc.nextInt();
            String j = "no";
            for(int i=0;i<a.length;++i)
            {
                if(a[i]==x)
                {
                    j = "yes";
                 System.out.println(j);
                /* int location = i;
                 System.out.println(i);
                   break;*/
                }
               
               
    
    }
    }
    
    
   
            
    
    

    