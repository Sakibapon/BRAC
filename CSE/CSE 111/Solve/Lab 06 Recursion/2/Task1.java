import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number you want to find factorial of:");// TODO Auto-generated method stub
		int number=sc.nextInt();
		System.out.println("The factorial is "+factorial(number));
	}
	public static int factorial(int n){
      if(n<=1)
      {
    	return 1;  
      }
      else
      {
    	  return n*factorial(n-1);
      }
	}
}
