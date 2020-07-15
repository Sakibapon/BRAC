import java.util.Scanner;
public class Lab01_09
{
  public static void display(int a[])
{
  for(int i=0;i<a.length;i++)
 {
   System.out.println(a[i]);
 }
}
  public static int[] squre(int a[])
{
  int a1[]=new int[10];
  for(int i=0;i<a.length;i++)
 {
    a1[i]=a[i]*a[i];
 }
  return a1;
}
  public static void main(String[]args)
  {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter 10 integers");
 int[]a=new int[10];
 for(int i=0;i<a.length;i++)
 {
   a[i]=sc.nextInt();
 }
    Lab01_09.display(a);
    int t[]=Lab01_09.squre(a);
      Lab01_09.display(t);
  }
}
