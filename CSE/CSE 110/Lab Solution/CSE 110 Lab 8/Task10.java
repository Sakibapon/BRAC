import java.util.Scanner;
public class Task10 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
System.out.println("Please input a number");
        for(int i=0;i<a.length;++i) 
        {
            
            a[i] = scanner.nextInt();
            for(int j=0;j<=i;++j) 
            {
                System.out.print(a[j]+",");
            }
        }
        
        
    }
}