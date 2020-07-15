import java.util.*;
public class Task8
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);    
    int line=sc.nextInt();
    for(int count=1; count<=line; count++)
    {
      for(int space=1; space<=(line-count); space++)
        {
        System.out.print(" ");
        }
      for (int num=1; num<=count; num++)
        {
        System.out.print(num);
        }
    System.out.println();        
      } 
   }    
}