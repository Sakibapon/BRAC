import java.util.*;
public class task5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur base number");
		int base=sc.nextInt();
		System.out.println("ENter ur exponent number");
		int exponent=sc.nextInt();
		
		System.out.println(bToEx(base,exponent));
	}
	
	public static int bToEx(int b,int exp){
		if(exp==0)
			return 1;
		else
			return b*bToEx(b,exp-1);
	}
}
