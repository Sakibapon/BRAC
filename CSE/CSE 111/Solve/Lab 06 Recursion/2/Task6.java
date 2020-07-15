import java.util.Scanner;
public class Task6 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base:");
		int base=sc.nextInt();
		System.out.println("Enter power:");
		int power=sc.nextInt();
        System.out.println(degree(base,power));
	}
	public static int degree(int base,int power){
		if(power==1){
			return base;
		}
		else
			return base*degree(base,power-1);

	}
}
