import java.util.Scanner;
public class Task03{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        int[] a= new int[5];
        int temp;
        
        for(int counter=0 ; counter<a.length; counter++){
            a[counter]=keyboard.nextInt();
        }
        for(int counter1=0 ; counter1<a.length ; counter1++){
            for(int counter2=0 ; counter2<a.length-1 ; counter2++){  
                if(a[counter2] < a[counter2+1]){
                    temp=a[counter2];
                    a[counter2]=a[counter2+1];
                    a[counter2+1]=temp;
                }
            }
        }  
        for(int counter3=0 ; counter3<a.length; counter3++){
            System.out.println(a[counter3]);
        }
        for(int counter4=0 ; counter4<a.length ; counter4++){
            if(a[counter4]%2==0){
                System.out.println(a[counter4]);    
            }
        }
    }
}
