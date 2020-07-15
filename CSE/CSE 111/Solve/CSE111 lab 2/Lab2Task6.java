import java.util.Scanner;
public class Lab2Task6{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [] a= new int[15];
        for(int c=0;c<a.length;c++){
            System.out.println("please enter a number between 0 & 9:");
            a[c]=input.nextInt();
        }
        int totalC=0;
        for(int count=0;count<10;count++){
            totalC=0;
            for(int m=0;m<a.length;m++){
                if(count==a[m]){
                    totalC++;
                }
            }
            System.out.println(count+" has occured "+totalC+" times");
        }
        input.close();
    }
}





