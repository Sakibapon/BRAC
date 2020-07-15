import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	// TODO Auto-generated method stub
		System.out.println("Please enter the N:");
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
	}
	public static int fibonacci(int m)
	{
      if(m==1)
      {
    	  return 0;
      }
      if(m==2)
      {
    	  return 1;
      }
      return fibonacci(m-1)+fibonacci(m-2);
	}
}
