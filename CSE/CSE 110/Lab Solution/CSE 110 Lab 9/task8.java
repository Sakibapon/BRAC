import java.util.Scanner;
public class task8
{
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    int arr [] = new int [10];
    for ( int i =0;i<arr.length;i++){
      System.out.println("Enter a number");
      arr[i] = sc.nextInt();
    }
    for ( int j = arr.length-1;j>=0;j--){
      int k = arr[j]%2;
      if(k==0){
        System.out.println(arr[j]);
      }
    }
  }
}