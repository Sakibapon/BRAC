import java.util.Scanner;
public class Lab01_04
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    for(int i=0;i<array.length;i++)
    {
      array[i]=sc.nextInt();
    for(int j=0;j<i;j++)
    {
      if(array[i]==array[j])
      {
       System.out.println("repeat,enter a number");
       i--;
       break;
  }
    }
      }
   }   
}
      