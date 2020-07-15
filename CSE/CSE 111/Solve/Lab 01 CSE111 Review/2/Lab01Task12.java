import java.util.Scanner;
public class Lab01Task12{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please input the value of 1st month : ");
        int fMonth=sc.nextInt();
        System.out.println("Please input day of 1st month : ");
        int fDay=sc.nextInt();
        System.out.println("\nPlease input the value of 2nd month : ");
        int sMonth=sc.nextInt();
        System.out.println("Please input day of 2nd month : ");
        int sDay=sc.nextInt();
        
        System.out.print(before(fMonth,fDay,sMonth,sDay));
    }
    
    public static boolean before(int fMonth,int fDay,int sMonth,int sDay){
        if(fMonth<sMonth){
            return true;
        }
        else if(fMonth==sMonth){
            if(fDay<sDay){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}