import java.util.Scanner;
public class Task11{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        int x= keyboard.nextInt();
        System.out.println(allDigitsOdd(x));
    }
    static boolean allDigitsOdd(int number){
        int remainder;
        boolean b=true;
        while(!(number==1 || number==3|| number==5|| number==7 || number==9) ){
            remainder=number%10;
            if(remainder%2==0){
                b=false;
                break;
            }
            else{
                number=number/10;     
            }
        }
        if (b==true){
            return b;
        }
        else{
            return b;
        }   
    }
}