/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Task10
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 For Right Rotation\n2 For Left Rotation");
        
        int temp = 0;
        
        int n = sc.nextInt();
        
        System.out.println("How many numbers in the array");
        
        int num = sc.nextInt();
        
        
        
        int a[] = new int[num];
        
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("No. of position to be rotated");
        
        int k = sc.nextInt();
        
        
        if(n == 1){
            while(k > 0){  // Right Rotation
                
                temp = a[a.length - 1];
                for(int i = a.length - 1; i > 0; i--){
                    
                    a[i] = a[i - 1];
                    
                }
                a[0] = temp;
                k--;
            }
            for(int item : a){
                System.out.print(item + " ");
            }
            System.out.println();
        }
        else if(n == 2){
            
            
            while(k > 0){
                
                temp = a[0];
                
                for(int i = 0; i <= a.length - 2; i++){
                    
                    a[i] = a[i + 1];
                }
                a[a.length - 1] = temp;
                k--;
            }
            
            for(int item : a){
                System.out.print(item + " ");
            }
            System.out.println();
            
        }
    }
}
