import java.util.Scanner;
public class Lab01_05
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number betweeen 0 to 9 ");
    int array[]=new int[15];
    int count[]=new int[10];
    for(int i=0;i<array.length;i++)
    {
      array[i]=sc.nextInt();
    for(int j=0;j<count.length;j++)
    {
      if(array[i]==j)
      {
        count[j]++;
  }
    }
      }
     for(int i=0;i<count.length;i++)
     {
     System.out.println(i+" was found "+count[i]+" times ");
     }
   }   
}
      