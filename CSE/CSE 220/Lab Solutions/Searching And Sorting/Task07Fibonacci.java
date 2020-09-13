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
import java.util.Scanner;
public class Task07Fibonacci 
{
    public static  int fibonacci(int n)
    {
        int []a = new int [n+1];
        if (n<=1) return n;
        if (a[n]!= 0) return a[n];
        else return a[n]=fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int num = sc.nextInt();
        System.out.println("Fibonacci Of "+num+" Is: "+fibonacci(num));
    }
}