/*
Task 5
Write a Java program that would ask the user to enter 15 numbers. All the numbers are between 0 and 9.
The program should count how many time the number been given.
*/

import java.util.*;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[15];

        for (int index = 0; index < array.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "\t");
            array[index] = scanner.nextInt();
        }
        myMethod(array);
    }
    public static void myMethod(int[] arr) {
        for (int number = 0; number < 10; number++) {
            int count = 0;
            for (int index2 = 0; index2 < arr.length; index2++) {
                if (number == arr[index2]) {
                    count++;
                }
            }
            System.out.println(number + " was found " + count + " times.");
        }
    }
}
