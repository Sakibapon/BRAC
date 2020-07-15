import java.util.Scanner;
public class Lab01Task08{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the size of matrix : ");
        int size=sc.nextInt();
        
        int [] firstMatrix=new int[size];
        int [] secondMatrix=new int[size];
        int [] thirdMatrix=new int[size];
        
        for(int counter=0; counter<size; counter++){
            System.out.println("Please enter a number in 1st matrix : ");
            firstMatrix[counter]=sc.nextInt();
        }
        
        System.out.print("\n");
        
        for(int counter=0; counter<size; counter++){
            System.out.println("Please enter a number in 2nd matrix : ");
            secondMatrix[counter]=sc.nextInt();
        }
        
        for(int counter=0; counter<size; counter++){
            thirdMatrix[counter]=(5*firstMatrix[counter])-secondMatrix[counter];
            System.out.print(thirdMatrix[counter]+" ");
        }
    }
}