import java. util.Scanner;
public class task5
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
      minLoc =j;
      for( int k =j+1; k<myarr.length;k++){
        if (myarr[k]>myarr[minLoc]){
          minLoc=k;
        }
      }
        temp=myarr[j];
        myarr[j]= arr[minLoc];
        myarr[minLoc]=temp;
     }
    for(int i=0; i<myarr.length; i++){
      System.out.println(myarr[i]);
    }
  }
}