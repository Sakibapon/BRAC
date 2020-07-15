import java.util.Scanner;
public class Task12{
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        int a,e,c,d;
        a=key.nextInt();
        e=key.nextInt();
        c=key.nextInt();
        d=key.nextInt();
        
        System.out.println(before(a,e,c,d));
    }
    static boolean before(int monthA, int dayA,int monthB,int dayB){
        boolean b=true;
        if(monthA<monthB){
            return b;
        }
        if(monthA==monthB){
            if(dayA<dayB){
                return b;
            }
            else{
                b=false;
                return b;
            }
        }
        else{
            b=false;
            return b;
        }
    }
}