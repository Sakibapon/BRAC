import java.util.*;
public class task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur number");
		int n=sc.nextInt();
		
		System.out.println(fact(n));
	}
	
	public static int fact(int n){
		if(n<2)
			return 1;
		else
			return n*fact(n-1);
	}
}
