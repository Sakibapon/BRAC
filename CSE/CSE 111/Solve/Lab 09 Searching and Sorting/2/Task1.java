import java.util.Scanner;
public class Task1 {
	public static void main(String[] args){
		Scanner key1 = new Scanner(System.in);
		int num = key1.nextInt();
		int ans = factorial(num);
		System.out.println(ans);
	}
	
	public static  int factorial(int n){
		if(n==0){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}

}
