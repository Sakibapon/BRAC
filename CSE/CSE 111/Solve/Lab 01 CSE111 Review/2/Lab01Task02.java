import java.util.Scanner;
public class Lab01Task02{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int array[]= new int[10];
        
        int highPosition=0, lowPosition=0;
        
        for(int count=0; count<array.length; count++){
            System.out.println("Please enter a number: ");
            array[count]=sc.nextInt();
        }
        
        for(int count=0; count<array.length; count++){
            if(array[count]>array[highPosition]){
                highPosition=count;
            }
            if(array[count]<array[lowPosition]){
                lowPosition=count;
            }
        }
        
        int temp=array[highPosition];
        array[highPosition]=array[lowPosition];
        array[lowPosition]=temp;
        
        for(int count=0; count<array.length; count++){
            if(count==array.length-1){
                System.out.print(array[count]);
            }
            else{
                System.out.print(array[count]+", ");
            }
        }
    }
}