import java.util.Scanner;

public class Task8_08{
 public static int[] sort(int a[], int i)
 { 
  if(i<a.length)
  {
   int temp=0;
   for(int p=0; p < a.length-1;p++)
   {
    if(a[p]> a[p+1])
    {
     temp=a[p+1];
     a[p+1]=a[p];
     a[p]=temp;
    }
   }
  i++;
  return sort(a, i);  
 }
  else 
  return a;
 }
 public static void main(String[] args)
 {
  int p[]={10,50,30,40,20,70,8,90,1,50};
  int q[]=sort(p,  0); 
  for(int c=0; c < q.length; c++){
   System.out.println(q[c]);
  }
 }
}
