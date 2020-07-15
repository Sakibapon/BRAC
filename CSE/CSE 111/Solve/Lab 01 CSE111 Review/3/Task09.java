import java.util.Scanner;
public class Task09{
    public static void main(String[] args){      
        Scanner keyboard= new Scanner(System.in);
        int a[]=new int[10];
        for(int counter=0 ; counter<a.length ; counter++){
            a[counter]=keyboard.nextInt();
        }
        method1(a);
        method2(a);
        method1(a);
    }
    static void method1(int[] x){
        for(int counter=0 ; counter<x.length ; counter++){
            System.out.print(x[counter]+" ");   
        }
        System.out.println();
    }
    static  void method2(int[] y){
        for(int counter=0 ; counter<y.length ; counter++){
            y[counter]=(int) Math.pow(y[counter],2);    
        }
    }
}