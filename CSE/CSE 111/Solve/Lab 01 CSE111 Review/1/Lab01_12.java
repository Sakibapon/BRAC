import java.util.Scanner;
public class Lab01_12
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("first month");
     int fm=sc.nextInt();
      System.out.println("second month");
     int sm=sc.nextInt();
      System.out.println("first day");
     int fd=sc.nextInt();
      System.out.println("second day");
     int sd=sc.nextInt();
        for(int c=0;c<1;c++){
            if(fm<1||fm>12||fd<1||fd>31||(fm==2&&fd>29)||((fm==9||fm==4||fm==6||fm==11)&&fd>30)){
                System.out.println("invalid,put input again");
                 System.out.println("first month");
                fm=sc.nextInt();
                 System.out.println("first day");
                fd=sc.nextInt();
                c--;
            }
        }
        for(int c=0;c<1;c++){
            if(sm<1||sm>12||sd<1||sd>31||(sm==2&&sd>29)||((sm==9||sm==4||sm==6||sm==11)&&sd>30))
            {
                System.out.println("invalid,put input again");
                 System.out.println("second month");
                sm=sc.nextInt();
                 System.out.println("second day");
                sd=sc.nextInt();
                c--;
            }
        }
        Lab01_12 obj=new Lab01_12();
        System.out.println(obj.before(fm,sm,fd,sd));
        
    }  
   public boolean before(int m1,int m2,int d1,int d2){
        if(m1<m2)
            return true;
        else if(m1==m2&&d1<d2)
            return true;
        else
            return false; 
    } 
  }
  
  
  
  
