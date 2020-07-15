import java.util.Scanner;
public class Task7 {

	public  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter base:");// TODO Auto-generated method stub
		int base= sc.nextInt();
		System.out.println("Please enter power:");
		int power=sc.nextInt();
		System.out.println(degree(base,power));
	}
	public int degree(int base,int power){
		if(power%2==0){
			return degree(base,power/2)*degree(base,power/2);
		}
		else{
			return degree(base,power/2)*degree(base,power/2)*base; 
		}
	}

}
