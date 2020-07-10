package com.company;

/*
Task 8
Ask user for dimension/size of two row matrices, take all values in each matrix
and print the summation. If matrices are A and B, then you need to calculate
C=5A-B.

*/

import java.util.*;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Insert The Length of The Array\t");
        int lenght = scanner.nextInt();
        int[] A = new int[lenght];
        int[] B = new int[lenght];
        int index;
        
        for (index = 0; index < A.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "for A Matrix\t");
            A[index] = scanner.nextInt();
        }
        for (index = 0; index < B.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "for B Matrix\t");
            B[index] = scanner.nextInt();
        }
        myMethod(A, B);
        for (index = 0; index < A.length; index++) {
            System.out.print(A[index]+ " ");
        }
    }

    public static int[] myMethod(int[] a, int[] b) {
        for (int index = 0; index < a.length; index++) {
            a[index] = a[index]*5-b[index];
        }
        return a;
    }
}