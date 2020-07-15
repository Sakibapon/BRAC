import java.util.Scanner;
public class Lab01_06
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array length");
    int n=sc.nextInt();
    int array[]=new int[n];
    for(int i=0;i<array.length;i++)
    {
    array[i]=sc.nextInt();
    }
  int b[]=new int[n];
  for(int i=array.length-1,j=0;j<array.length;i--,j++)
  {
    b[j]=array[i];
  }
  boolean flag=true;
for(int i=0;i<array.length;i++)
{
if(b[i]!=array[i])
{
  flag=false;
System.out.println("not palindrome");
break;
}
}
if(flag==true)
  System.out.println("palindrome");
}
}

