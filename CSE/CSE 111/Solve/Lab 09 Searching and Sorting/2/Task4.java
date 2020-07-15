import java.util.Scanner;
public class Task4 {
	public static void main(String[] args){
		Scanner key1 = new Scanner(System.in);
		System.out.println("Enter");
		int num = key1.nextInt();
		binaryConversion(num);
	}

	private static void binaryConversion(int num) {
		// TODO Auto-generated method stub
		if(num>0){
		    binaryConversion(num/2);
			System.out.print(num%2+" ");
		}
		
	}

}
