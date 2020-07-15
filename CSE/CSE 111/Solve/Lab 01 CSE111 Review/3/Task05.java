import java.util.Scanner;
public class Task05{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        int[] a=new int[10];
        int input;
        
        for(int i=0 ; i<15 ; i++){
            input=keyboard.nextInt();
            a[input]++;
        }
        for(int counter=0 ; counter<a.length ; counter++){
            System.out.println(counter + " was found " + a[counter] + " times ");
        }
    }
}
        