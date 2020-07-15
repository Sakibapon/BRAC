import java.util.*;
public class Task6
{
  public static void main(String[] args)
  {
    Scanner keyboard=new Scanner(System.in); 
    System.out.println("Please enter the line no.");
    int line=keyboard.nextInt();
    for(int count=1; count<=line; count++)
    {
      for(int num=1; num<=count; num++)
    {
      System.out.print(num);
    }
     System.out.println();
    }    
  }
}