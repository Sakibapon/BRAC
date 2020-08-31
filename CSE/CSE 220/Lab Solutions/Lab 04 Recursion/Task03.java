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
public class Task03 
{
    public static void printarray(int[] array, int count) 
    {
        if(count < array.length) 
        {  
            System.out.print(array[count]+" ");
            count++;
            printarray(array, count);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = sc.nextInt();
        int[] array = new int[length];
        int c=1;
        for(int i = 0; i < length; i++) 
        {
            System.out.println("Please Enter "+c +"th Array Index Number ");
            c++;
            array[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        printarray(array, 0);
    }
}