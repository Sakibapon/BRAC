package com.company;

/*
Task 4
Write a Java program that would ask the user to enter ten numbers.
As the user enters the ten numbers the program will make sure that all the numbers entered by the user are unique.
For example if the user enters 2, 3, 4, 6, and then tries to enter 3 again the program will display that 3 is
already in among the entered numbers and would ask the user to enter a new number.
*/

import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int index = 0; index < array.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "\t");
            array[index] = scanner.nextInt();
            check: for (int i = 0; i < index; i++) {
                if(array[index] == array[i]){
                    System.out.println("\n" +array[index]+ " is already in among the entered numbers\nPlease insert again\n");
                    index = index-1;
                    break check;
                }
            }
        }
		
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
