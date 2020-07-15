import java.util.Scanner;
public class Task2 {
	
	static int n1=0,n2=1,n3=0;
	public static void fib(int n){
		if(n>0){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			fib(n-1);
		}
	}
	
	public static void main(String[] args){
		Scanner key1 = new Scanner(System.in);
		int num = key1.nextInt();
		System.out.print(n1+" "+n2);
		fib(num-2);
		System.out.println();
		
	}
}
