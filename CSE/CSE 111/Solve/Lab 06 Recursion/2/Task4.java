import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a decimal number:");
		int Dnumber=sc.nextInt();
		binary(Dnumber);
	}
	public static void binary(int num){
		if(num<2){
			System.out.print(num);
		}
		else{
			int rem=num%2;
			num=num/2;
			binary(num);
			System.out.print(rem);
		}
	}
}