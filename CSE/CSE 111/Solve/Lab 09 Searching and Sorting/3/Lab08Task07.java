import java.util.Scanner;
public class Lab08Task07{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num=sc.nextInt();
        System.out.println("Please enter the power: ");
        int pow=sc.nextInt();
        
        System.out.println(counter(num,pow));
    }
    
    public static int counter(int num, int pow){
        if(pow==0){
            return 1;
        }
        else{
            if(pow%2==0){
                return counter(num, pow/2)*counter(num, pow/2);
            }
            else{
                return num*counter(num, pow/2)*counter(num, pow/2);
            }
        }
    }
}