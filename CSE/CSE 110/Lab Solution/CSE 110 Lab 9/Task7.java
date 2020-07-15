import java.util.Scanner;
public class Task7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int myarr[]= new int[15];
        int numTotal=0;
       for(int Count=0;Count<myarr.length;Count++) {
           System.out.println("Enter a number");
            myarr[Count] = sc.nextInt();
         }
        for(int numCount=0;numCount<=9;numCount++) {
            numTotal=0;
            for(int Count=0;Count<myarr.length;Count++) {
                if (myarr[Count]==numCount)
                    numTotal++;
            }
            System.out.println(numCount+" is entered "+numTotal+ "times");
       }
    }
}