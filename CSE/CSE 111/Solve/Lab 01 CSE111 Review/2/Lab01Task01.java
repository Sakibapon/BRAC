import java.util.Scanner;
public class Lab01Task01{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Please enter the array length: ");
        int length=sc.nextInt();
        
        int [] array= new int[length];
        
        for(int count=0; count<length; count++){
            System.out.println("Please enter a number in array: ");
            array[count]=sc.nextInt();
        }
        System.out.println(checker(array,length));
    }
    
    public static boolean checker(int[] store,int length){
        boolean check=false;
        if(store[0]==6||store[length-1]==6){
            check=true;
            return check;
        }
        return check;
    }
}