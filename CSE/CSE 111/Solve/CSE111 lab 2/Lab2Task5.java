import java.util.Scanner;
public class Lab2Task5{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int [] a=new int[10];
        
        for(int i=0;i<a.length;i++){
            System.out.println("please enter a number");
            a[i]=input.nextInt();
        }
        
        System.out.println("please enter another number");
        int n=input.nextInt();
        boolean b=false;
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                System.out.println("YES");
                b=true;
                break;
            }
        }
        if(b==false){
            System.out.println("NO");
        }
        input.close();
    }
}



