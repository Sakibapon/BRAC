import java. util.Scanner;
public class task1
{
  public static void main (String[]args)
  {
   Scanner sc= new Scanner(System.in);
     int myarr[]=new int[5];
     int max= myyarr[0];
     for (int i=0; i<myarr.length; i++){
       myarr[i]=sc.nextInt();
     }
    for( int count=0; count<myarr.length; count++){
      if( myarr[count]>max){
      max= myarr[count];
    }
    }
    System.out.println ("Largest number is " + max);
  }
}
