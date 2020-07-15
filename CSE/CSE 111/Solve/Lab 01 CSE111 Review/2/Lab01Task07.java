import java.util.Scanner;
public class Lab01Task07{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int array[]= new int[10];
        
        for(int count=0; count<array.length; count++){
            System.out.println("Please enter a number: ");
            array[count]=sc.nextInt();
        }
        System.out.println("Please enter the slot number between 0 to 9: ");
        int star=sc.nextInt();
        
        for(int count=1; count<=array[star]; count++){
            System.out.print("*");
        }
    }
}