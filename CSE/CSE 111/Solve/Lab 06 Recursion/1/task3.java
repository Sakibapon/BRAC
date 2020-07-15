
public class task3 {
	public static void main(String[] args) {
		
		
		
		int[] a={10,20,54,98,45};
		
		rcrcvArr(a,a.length-1);
	}
	
	public static void rcrcvArr(int[] a,int i){
		if(i!=0){
			System.out.print(a[i]+" ");
			rcrcvArr(a,i-1);
		}
		else{
			System.out.print(a[i]);
		}
	}
}
