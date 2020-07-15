import java.util.Scanner;
public class Lab08Task06{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num=sc.nextInt();
        System.out.println("Please enter the power: ");
        int pow=sc.nextInt();
        System.out.println("The result is: "+power(num,pow));
    }
    public static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        else{
            return num*power(num,pow-1);
        }
    }
}