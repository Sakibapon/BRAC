import java .util.Scanner;
public class Task8_01{
  
  public static int factorilize(int n)
  {
    if(n==0)
    return 1;
    else
    return n*factorilize(n-1);
    }
  
 

  public static void main(String[]args)
  {
  Scanner p = new Scanner (System.in);
  System.out.println("Give a number to factorilize");
  int q=p.nextInt();
  System.out.println("Answer is: " + factorilize(q));
  }
}
