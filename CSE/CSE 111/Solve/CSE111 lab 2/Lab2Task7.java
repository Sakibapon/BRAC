import java.util.Scanner;
public class Lab2Task7{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [] a=new int[10];
        for(int i=0;i<a.length;i++){
            System.out.println("please enter a number");
            a[i]=input.nextInt();
            for(int c=0;c<=i;c++){
                System.out.print(+a[c]+" ");
            }
        }
        input.close();
    }
}






