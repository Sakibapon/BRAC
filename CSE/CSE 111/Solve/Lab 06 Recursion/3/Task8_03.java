import java .util.Scanner;
public class Task8_03{
  
public static int contains(int[] a, int start, int end, int k)
{
if (start > end)
return start;
else 
{
int mid = (start + end)/2;
if (k == a[mid])
return mid;
else if (k > a[mid])
return contains(a, mid + 1, end, k);
else
return contains (a, start, mid - 1, k);
}
 }
  public static void main(String []args)
  {
  Scanner p = new Scanner (System.in);
  int q[]={10,20,30,40,50};
  System.out.println(contains(q,0,q.length-1,40));
  }
}