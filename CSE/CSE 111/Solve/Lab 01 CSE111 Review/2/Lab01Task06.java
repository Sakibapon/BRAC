import java.util.Scanner;
public class Lab01Task06{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the array length : ");
        int temp=sc.nextInt();
        int array[]= new int[temp];
        
        for(int count=0; count<array.length; count++){
            System.out.println("Please enter a number: ");
            array[count]=sc.nextInt();
        }
        boolean yes= true;
        for(int start=0,end=array.length-1; start<end; start++, end--){
            if(array[start]!=array[end]){
                System.out.println("It is not a palindrome");
                yes=false;
                break;
            }
        }
        if(yes==true){
            System.out.println("It is a palindrome");
        }
    }
}