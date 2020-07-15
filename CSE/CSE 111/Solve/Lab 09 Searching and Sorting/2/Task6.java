
public class Task6 {
	public static void main(String[] args){
		System.out.println(power(4,4));
	}
	
	public static int power(int m,int n){
		if(n>1){
			
			return m*power(m,n-1);
		}else{
			return m;
		}
	}

}
