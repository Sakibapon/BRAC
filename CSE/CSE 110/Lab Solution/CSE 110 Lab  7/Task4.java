import java.util.*;
public class Task4
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);    
    System.out.println("Please enter the line no.");
    int line=sc.nextInt();
    System.out.println("Please enter the target no.");
    int number=sc.nextInt();
    
    for(int count=1; count<=line; count++)
    {
    for(int num=1; num<=number; num++)
    {
      System.out.print(num);
    }
    System.out.println();
    }
    
  }
}