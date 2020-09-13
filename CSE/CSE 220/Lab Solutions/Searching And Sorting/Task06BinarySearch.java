/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse220lab05;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Sakib
 */

public class Task06BinarySearch
{
    public static int binarySearch(int[] a, int n, int first, int last) 
    {
        if (first<last) 
        {
            int mid = (first + last) / 2;
            if (n > a[mid]) return binarySearch(a, n, mid + 1, last); 
            else if (n < a[mid]) return binarySearch(a, n, first, mid - 1);
            else if (n == a[mid]) return mid;
        }
    return -1;
    }
    
    public static void main(String[] args)
    {
        int[] a = {243,435,23,4,4,6,2,5,32,6,23,84,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int n = sc.nextInt();
        int index = binarySearch(a,n,0,a.length-1);
        if (index == -1) System.out.println("Element "+n+" not found"); 
        else System.out.println("Element "+n+" found at index " + index); 
    }

    
}

