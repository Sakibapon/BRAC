import java.util.Scanner;
public class Task08{ 
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Please enter the length of the matrix");
        
        int x=keyboard.nextInt();
        int a[]=new int[x];
        int b[]=new int[x];
        int c[]=new int[x];
        
        for(int counter=0 ; counter<a.length ; counter++){
            a[counter]=keyboard.nextInt();
        } 
        for(int counter1=0 ; counter1<b.length ; counter1++){
            b[counter1]=keyboard.nextInt();
        }
        for( int counter2=0 ; counter2<a.length ; counter2++){
            c[counter2]=5*a[counter2]-b[counter2];
            System.out.print(c[counter2]+" ");
        }
        System.out.println();
    }
}




