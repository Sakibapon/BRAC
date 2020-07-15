
public class Task7 {
	public static void main(String[] args){
		System.out.println(power(4,4));
	}
	
	public static int power(int m,int n){
		if(n==0){
			
			return m*power(m,n-1);
		}else if(n==1){
			return m;
		}
		 else{
	            if(n%2==1){
	                return m*power(m,n/2)*power(m,n/2);
	            }
	            else{
	                return power(m,n/2)*power(m,n/2);
	            }
	        }
	}

}
