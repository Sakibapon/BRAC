import java.util.Scanner;
public class Task04{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        int a[]=new int[10];
        
        for(int counter=0 ; counter <a.length ; counter++){
            a[counter]=keyboard.nextInt();
            for(int i=0 ; i<counter; i++){
                if(a[counter] == a[i]){
                    System.out.println("This number already exists,please enter another integer number");
                    a[counter]=keyboard.nextInt();
                    if(a[counter]==a[i]){
                        i--;
                    }
                }
            }
        }
    }
}

