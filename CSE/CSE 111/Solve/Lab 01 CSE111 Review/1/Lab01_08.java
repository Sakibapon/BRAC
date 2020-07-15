import java.util.Scanner;
public class Lab01_08
{
  public static void main(String[]args)
  {
 Scanner sc=new Scanner(System.in);
 System.out.println(" enter size of array ");
 int m=sc.nextInt();
 int a[][]=new int[1][m];
 int b[][]=new int[1][m];
 int c[][]=new int[1][m];
  for(int row=0;row<a.length;row++)
  {
  for(int col=0;col<a[0].length;col++)
  {
    System.out.println("for a matrix ");
    System.out.println("row "+(row+1)+" col "+(col+1));
    a[row][col]=sc.nextInt();
     }
  }
    for(int row=0;row<b.length;row++)
  {
  for(int col=0;col<b[0].length;col++)
  {
    System.out.println(" for b matrix ");
    System.out.println("row "+(row+1)+" col "+(col+1));
    b[row][col]=sc.nextInt();
     }
  }
  for(int row=0;row<c.length;row++)
  {
  for(int col=0;col<c[0].length;col++)
  {
    c[row][col]=5*a[row][col]-b[row][col];
     }
  }
  for(int row=0;row<c.length;row++)
  {
  for(int col=0;col<c[0].length;col++)
  {
    System.out.print(c[row][col]+"\t ");
     }
  System.out.println();
  }
  }
}