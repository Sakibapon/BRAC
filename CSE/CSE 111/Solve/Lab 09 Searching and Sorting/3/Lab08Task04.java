import java.util.Scanner;
public class Lab08Task04{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the decimal number: ");
        int num=sc.nextInt();
        binary(num);
    }
    public static void binary(int num){
        if(num>0){
            binary(num/2);
            System.out.print(num%2);
        }
    }
}