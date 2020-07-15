import java .util.Scanner;
public class Task8_04{
  
  public static void convert(int n)
  {
    if(n>0)
    {
    convert(n/2);
    System.out.print(n%2 + "");
    }
  } 
  public static void main(String []args){
  Scanner p = new Scanner (System.in);
  int q=p.nextInt();
 convert(q);
  System.out.println();
  }
}