import java. util.Scanner;
public class task4
{
  public static void main (String[]args)
  {
    Scanner sc= new Scanner (System.in);
    int myarr[]= new int[5];
    for (int i=0;i <myarr.length; i++){
      myarr[i]= sc.nextInt();
    }
    int minLoc;
    int temp;
    for(int j=0; j<myarr.length-1; j++){
      minLocation =j;
      for( int h =j+1; k<myarr.length;h++){
        if (arr[h]<myarr[minLoc]){
          minLoc=h;
        }
      }
        temp=myarr[j];
        myarr[j]= myarr[minLoc];
        myarr[minLoc]=temp;
     }
    for(int i=0; i<myarr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
    