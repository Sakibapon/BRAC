import java.util.Scanner;

public class Task3 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int array[]={-5,2,3,5,6,8,10,12};
		System.out.println("Check this number:" );
		int num=sc.nextInt();
		int start=0;
		int end=array.length-1;
		System.out.println(binSearch(array,num,start,end));
	}
	public static boolean binSearch(int []a,int num,int start,int end){
		int mid=(start+end)/2;
		if(a[mid]==num){
			return true;
		}
		if(end<start){
			return false;
		}
		if(num>a[mid]){
			return binSearch(a,num,mid+1,end);
		}
		if(num<a[mid]){
			return binSearch(a,num,start,mid-1);
		}
		return false;
	}
}
