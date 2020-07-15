import java.util.Scanner;
public class Lab01_10
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a month ");
   int month=sc.nextInt();
    System.out.println("enter a day ");
   int day=sc.nextInt();
   for(int i=0;i<1;i++)
   {
 if(month<1||month>12||day<1||day>31||(month==2&&day>29)||((month==4||month==6||month==9||month==11)&&day>30))
 {
   System.out.println("invalid,give month and day again");
   month=sc.nextInt();
   day=sc.nextInt();
   i--;
  }
   }
 Lab01_10 t=new Lab01_10();
System.out.println(t.season(month,day));
 }

public String season(int month,int day)
{
if(month<3||(month==3&&day<=15))
  return "winter";
else if(month<6||(month==6&&day<=15))
  return "spring";
else if(month<9||(month==9&&day<=15))
  return "summer";
else if(month<12||(month==12&&day<=15))
  return "fall";
else
  return "winter";
}
}