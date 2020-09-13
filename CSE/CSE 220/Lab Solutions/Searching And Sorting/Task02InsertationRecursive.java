/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this xlate file, choose Tools | xlates
 * and open the xlate in the editor.
 */
package cse220lab05;

/**
 *
 * @author Sakib
 */
public class Task02InsertationRecursive
{
    public static int[]insertationRecursive(int b[],int i)
    {
        if(i==b.length) return b;
        int x;
        for(int j=i-1;j>=0;j--)
        {
            if(b[j]>b[j+1])
            {
                x=b[j+1];
                b[j+1]=b[j];
                b[j]=x;
            }
            else break;
            
        }
        return insertationRecursive(b,i+1);
    }
    public static int[]print(int[]a)
    {
        for(int i=0; i<a.length;i++) System.out.print(a[i]+" ");
        return a;
    }
    public static void main(String[] args) 
    {
        int a[]={10,41,5423,3,53,12,47,21};
        int insert[]=insertationRecursive(a,0);
        System.out.println("Insertation Recursive Sort: ");
        print(insert);
        
    }
}