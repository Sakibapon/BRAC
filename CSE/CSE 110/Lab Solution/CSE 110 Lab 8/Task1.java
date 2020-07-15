import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc =new Scanner(System.in);
        int [] a = new int[3];
        for(int c=0;c<=a.length-1;c++)
        {
            System.out.println("please enter input");
            a[c]=sc.nextInt();
            }
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum+=a[i];
           }
         System.out.println(sum);
      /* System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);*/
         for(int i=0;i<a.length;i++)
         {
             System.out.println(a[i]);
        
        }
        	 
    }

}
