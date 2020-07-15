import java. util.Scanner;
public class task9
{
  public static void main (String[]args)
  {
    Scanner sc= new Scanner (System.in);
    String myarr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    System.out.println("Enter a number between 0 to 9");
    int p= sc.nextInt();
    System.out.println(myarr[p]);
  }
}
    