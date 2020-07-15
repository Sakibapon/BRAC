import java.util.Scanner;
public class Task06{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int i=keyboard.nextInt();
        
        int a[]=new int[i];
        int palindrome=0;
        
        for(int c=0 ; c<a.length ; c++){
            a[c]=keyboard.nextInt();
        }
        for(int counter=0 ; counter<a.length/2 ; counter++){
            if(a[counter]==a[a.length-1-counter]){
                palindrome++;
            }
        }
        if(palindrome==a.length/2){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }  
    }
}
