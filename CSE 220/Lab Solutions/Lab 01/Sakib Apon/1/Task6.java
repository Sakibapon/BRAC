/*
Task 6
An array is a palindrome if it reads the same in both directions. For example,
3 5 7 2 4 is not a palindrome; however, the following one is 4 2 6 2 4.
Write a program that reads in an array and checks if it is a palindrome

*/

import java.util.*;
public class Task6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Insert The Length of The Array\t");
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];

        for (int index = 0; index < array.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "\t");
            array[index] = scanner.nextInt();
        }
        myMethod(array);
    }
    public static void myMethod(int[] arr) {
        int i, j = (arr.length-1), check=0;

        for (i = 0; i < ((arr.length / 2)-1); i++) {
            if(arr[i] == arr[j]){
                j--;
                check++;
            }
            else{
                check = 0;
                break;
            }
        }

        if(check != 0) {
            System.out.println("\nPalindrome");
        }
        else{
            System.out.println("\nNot Palindrome");
        }

    }
}