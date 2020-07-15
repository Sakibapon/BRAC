import java.util.Scanner;
public class Lab01_02
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    for(int i=0;i<array.length;i++)
    {
    array[i]=sc.nextInt();
    }
   int minloc=0,maxloc=0,max=array[0],min=array[0];
   for(int i=1;i<array.length;i++)
    {
    if(array[i]>max)
    {
    maxloc=i;
    }
    else if(array[i]<min)
      minloc=i;
   }
   int temp=array[maxloc];
   array[maxloc]=array[minloc];
   array[minloc]=temp;
     for(int i=0;i<array.length;i++)
    {
    System.out.println(array[i]);
    }
  }
}
      