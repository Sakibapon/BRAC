mport java.util.Scanner;
public class Task11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Please enter a number");
            a[i] = scanner.nextInt();
            for(int j=0;j<i;j++) 
            {
                if(a[j]==a[i])
                {
                    System.out.println("You cant enter this number;Please enter another number!");
                    
                }
            }
        }
        
        
    }
}