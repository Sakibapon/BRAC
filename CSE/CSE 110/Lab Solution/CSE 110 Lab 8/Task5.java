import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("please enter input");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				break;
			}
		}
	}
}
