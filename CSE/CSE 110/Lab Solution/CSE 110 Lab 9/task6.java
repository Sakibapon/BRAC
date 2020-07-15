import java. util.Scanner;
public class task6
{
  public static void main (String[]args)
  {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter how many numbers");
    int n=sc.nextInt();
    int[] arr= new int[n];
    int temp;
    for(int count=0; count<arr.length;count++){
      System.out.println("Enter a number");
      arr[count]= sc.nextInt();
    }
    for (int count=0; count<arr.length-1;count++){
      if(arr[count]>arr[count+1]){
        temp=arr[count];
        arr[count]=arr[count+1];
        arr[count+1]=temp;
      }
    }
   if(n%2!=0){
  System.out.println(arr[arr.length/2]);
                     }
   else{
  int median;
  median=(arr[arr.length/2-1]+ arr[arr.length/2])/2;
  System.out.println(median);
  }
 }
}
  
    
    