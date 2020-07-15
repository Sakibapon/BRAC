import java.util.Scanner;
public class Lab2Task4{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [] a=new int [20];
        for(int c=0;c<a.length;c++){
            System.out.println("please enter a number");
            a[c]=input.nextInt();
        }
        for(int i=a.length-1;i>=0;i--){
            if(a[i]%2==0){
                System.out.println(a[i]);

            }
        }
        input.close();
    }
}





