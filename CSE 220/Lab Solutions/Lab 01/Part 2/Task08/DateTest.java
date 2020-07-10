import java.util.*;

class DateTest{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Date obj = new Date(a,b,c);
        
        obj.displayDate();
        System.out.println();
    }
}