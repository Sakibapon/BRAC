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
public class Task05 
{
    public static int find(int m, int n) 
    {
        if(n == 1)  return m;
        else if(n == 0) return 1;
        return m * find(m, n - 1);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number.");
        int m = sc.nextInt();
        System.out.println("Please Enter for Number "+m);
        int n = sc.nextInt();
        System.out.println(m+"^"+n+" Is : "+find(m,n));
    }
}