import java.util.Scanner;
public class Lab08Task01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input the value of N");
        int num=sc.nextInt();
        System.out.println("The factorial of "+ num+ " is: "+factorial(num));
    }
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}