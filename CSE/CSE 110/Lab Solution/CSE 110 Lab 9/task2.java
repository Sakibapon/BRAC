import java.util.Scanner;
public class task2
{
  public static void main (String[]args)
  {
    Scanner sc= new Scanner (System.in);
     int myarr[]=new int[5];
     int location= 0;
     int max= myarr[0];
     for (int i=0; i<arr.length; i++){
       myarr[i]=sc.nextInt();
     }
    for( int count=0; count<myarr.length; count++){
      if( myarr[count]>max){
      max= myarr[count];
      location= count;
    }
    }
    System.out.println ("Largest number is " + max);
    System.out.println( "Location is "+ location);
  }
}