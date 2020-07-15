import java.util.Scanner;
public class Task6
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int [] a = new int[4];
        System.out.println("please enter input");

        for(int i=0;i<a.length;++i)
        {
            a[i]=sc.nextInt();
        }
        for(int c=a.length-1;c>=0;--c){
            if(a[c]%2!=0)
            {
                System.out.println(a[c]);
                break;
            }
        }
    }
}






