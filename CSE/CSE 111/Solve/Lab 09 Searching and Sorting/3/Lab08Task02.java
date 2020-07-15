import java.util.Scanner;
public class Lab08Task02{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input the value of N");
        int num=sc.nextInt();
        System.out.println("The fibonacci of "+ num+ " is: "+fibonacci(num));
    }
    public static int fibonacci(int num){
        if(num==0||num==1){
            return num;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}