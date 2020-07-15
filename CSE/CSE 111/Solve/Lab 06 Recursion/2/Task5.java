import java.util.Scanner;
public class Task5 {
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n1=sc.nextInt();
		System.out.println("Please enter another number:");
		int n2=sc.nextInt();
		System.out.print("The GCD is "+GCD(n1,n2));
	}
	public static  int GCD(int n1,int n2){
		int rem;
		if(rem==0){
			return n2;
		}
		if(n1>n2){ //n1==45  n2==10
			rem=n1%n2;
			return GCD(n2,rem);
		}
		else{
			rem=n2%n1;
			return GCD(n1,rem);
		}
	}
}
