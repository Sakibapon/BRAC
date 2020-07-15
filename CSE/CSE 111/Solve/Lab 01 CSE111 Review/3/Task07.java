import java.util.Scanner;
public class Task07{
    public static void main(String[] args){
        
        Scanner keyboard= new Scanner(System.in);
        
        int a[]= new int[10];
        
        for(int counter=0 ; counter<a.length ; counter++){
            a[counter]=keyboard.nextInt();
        }
        System.out.println("Please enter an integer");
        int i=keyboard.nextInt(); 
        for(int counter1=0 ; counter1<a[i] ; counter1++){
            System.out.print('*');
        }
        System.out.println();
    }
}

