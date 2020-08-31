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
public class Task01
{
    public static int factorial(int n) 
    {
        if(n <= 1)  return 1;
        else return n * factorial(n - 1);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+": "+factorial(n));
    }
}