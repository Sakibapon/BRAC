import java.util.Scanner;
public class Lab01Task04{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int array[]= new int[10];
        int temp;
        
        for(int count=0; count<array.length; count++){
            System.out.println("Please enter a number: ");
            array[count]=sc.nextInt();
            for(int counter=0; counter<count; counter++){
                if(array[counter]==array[count]){
                    System.out.println("It is a duplicate input. Please enter another number .");
                    count--;
                    break;
                }
            }
        }
    }
}