/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cse220lab4;

/**
 *
 * @author Sakib
 */
import java.util.Scanner;
public class Task02 
{
    public static int fib(int n) 
    {
        if(n <= 1)   return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int n = sc.nextInt();
        System.out.println("Fibonacci Number for "+n+" : "+fib(n));
    }
}