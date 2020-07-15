import java .util.Scanner;
public class Task8_02{
  
 public static  int fib(int n)
 {
    if(n==0)
    return 0;
    else if(n==1)
      return 1;
    else
    return fib(n-1)+fib(n-2);
  }
  public static void main(String []args){
  Scanner p = new Scanner (System.in);
  int q=p.nextInt();
  System.out.println(fib(q));
  }
}
