/*
Task 7
Read 10 input from the user, and store them in an array. Then ask the user to give another input between 0 and 9 for
choosing an array cell. Display a line with that many "*" characters.
*/

import java.util.*;
public class Task7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int index;

        for (index = 0; index < array.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "\t");
            array[index] = scanner.nextInt();
        }
        System.out.print("Please Insert a Number Among 0 to 9\t");
        int number = scanner.nextInt();

        myMethod(array, number);
    }

    public static void myMethod(int[] arr, int num) {
        for (int i = 0; i < arr[num - 1]; i++) {
            System.out.print("*");
        }
    }
}