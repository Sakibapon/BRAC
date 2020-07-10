/*Task9
Write a Java Code of a program that declares an array of integer type of size 10 and takes input of your choice. Have the program print the values, square all the values, and then display the new values. Write a static method (in the same class as main method) to do the displaying and a second static method to find out the squares. Have the methods take the array name and the array size as arguments. 
*/

import java.util.*;
public class Task9{
    static Scanner scanner = new Scanner(System.in);
    static void display(int size){
        
        int array[] = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Old Array: ");
        for(int item : array){
            System.out.print(item + " ");
        }

        System.out.println();
        square(array);
    }

    static void square(int [] array){
        int arr[] = new int[array.length];

        for(int index = 0; index < array.length; index++){
            arr[index] =(int) Math.pow(array[index],2);
        }

        System.out.println("new Array: ");
        for(int item2 : arr){
            System.out.print(item2 + " ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        display(10);
    }
}