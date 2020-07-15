import java.util.Scanner;
public class CSE420MID
{
  private static String semester;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter your id");
    String input= sc.nextLine();
    
    String year = input.substring(0,4);
    String sem=input.substring(4,5);
    String dept=input.substring(5,7);
    String id=input.substring(7);
    
    String semester="";
    if(sem.equals("1")){
       semester= "spring";
    }
    else if(sem.equals("2"))
    {  semester="fall";
      
    }
    else
    {
       semester="summer";
      
    }
    String department = "";
    if(dept.equals("60"))
         {
       department="CSE";
    }
      else if(dept.equals("50"))
         {
          department="EEE";
       }
       else if(dept.equals("55"))
         {
        department="civil";
       }
       else
         {
         department="Pharma";
       }
    System.out.println("The year = " + year);
       System.out.println("Semester = " +semester);
       System.out.println("Department = "+department); 
       System.out.println("Unique ID = "+id);
       
       }
}