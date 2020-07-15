import java.util.*;
public class Task5
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the line no.");
    int line=sc.nextInt();
    for(int count=1; count<=line; count++)
    {
      for(int star=1; star<=count; star++)
      {
        System.out.print("*");
      }
     System.out.println();
    }    
  }
}