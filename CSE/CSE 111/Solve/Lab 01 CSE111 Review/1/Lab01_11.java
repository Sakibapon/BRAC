import java.util.Scanner;
public class Lab01_11
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in); 
   int num=sc.nextInt();
   int leng=(""+num).length();
    Lab01_11 obj=new Lab01_11();
    System.out.println(obj.allDigitsOdd(num,leng));
  }
 public boolean allDigitsOdd(int n,int l){
        int even=0;
        for(int i=0;i<l;i++){
            if(n%2==0)
            {
                even++;
                n=n/10;
            }
            else
                n=n/10;
        }
        if(even>0)
            return false;
        else
            return true;
    }
} 
