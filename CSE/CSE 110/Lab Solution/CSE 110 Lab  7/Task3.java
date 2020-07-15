import java.util.*;
public class Task3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);    
    System.out.println("Please enter the line no.");
    int line=sc.nextInt();
    System.out.println("Please enter the star no.");
    int stars=sc.nextInt();
    
    for(int count=1; count<=line; count++)
    {
    for(int starcount=1; starcount<=stars; starcount++)
    {
      System.out.print("*");
    }
    System.out.println();
    }
    
  }
}