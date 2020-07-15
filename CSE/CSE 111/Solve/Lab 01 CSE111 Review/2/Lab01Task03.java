import java.util.Scanner;
public class Lab01Task03{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int array[]= new int[5];
        
        for(int count=0; count<array.length; count++){
            System.out.println("Please enter a number: ");
            array[count]=sc.nextInt();
        }
        
        for(int count=0; count<array.length; count++){
            for(int counter=0; counter<count; counter++){
                if(array[counter]<array[count]){
                    int temp=array[count];
                    array[count]=array[counter];
                    array[counter]=temp;
                }
            }
        }
        
        for(int count=0; count<array.length; count++){
          System.out.print(array[count]+", ");
        }
        
        for(int count=0; count<array.length; count++){
            if(array[count]%2==0){ 
                if(count==array.length-1){
                    System.out.print(array[count]);
                }
                else{
                    System.out.print(array[count]+", ");
                }
            }
        }
    }
}