import java.util.*;
public class Task2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);    
    int target=sc.nextInt();
    for(int star=1; star<=target; star++)
    {
      System.out.print("*");
    }
    System.out.println();
  }
}