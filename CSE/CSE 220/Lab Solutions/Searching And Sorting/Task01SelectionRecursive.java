/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse220lab05;

/**
 *
 * @author Sakib
 */
public class Task01SelectionRecursive {

    public static int[]selectionRecursive(int a[],int i)
    {
        if(i==0) return a;
        int m,mindex,temp;
        m=-10;
        mindex=-1;
        for(int j=0;j<=i;j++)
        {
            if(m<a[j])
            {
                m=a[j];
                mindex=j;
            }
        }
        temp=a[mindex];
        a[mindex]=a[i];
        a[i]=temp;
        return selectionRecursive(a,i-1);
    }
    public static int[]print(int[]a)
    {
        for(int i=0; i<a.length;i++) System.out.print(a[i]+" ");
        return a;
    }
    public static void main(String[] args) 
    {
        int a[]={21,413,543,23,2,6,34};
        int A[]=selectionRecursive(a,a.length-1);
        System.out.println("Selection Recursive Sort: ");
        print(A);
        
        
    }
    
}
