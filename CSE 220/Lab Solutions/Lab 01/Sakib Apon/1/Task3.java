/*Task 3
Write a program which reads 5 numbers into an array, sorts/arranges the numbers from low to high and prints all numbers in the array and the even number in that list.
If the user enters 7, 13, 2, 10, 6 then your program should print 13, 10, 7, 6, 2, 10, 6 , 2.
*/

import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int index = 0; index < array.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "\t");
            array[index] = scanner.nextInt();
        }
		
        array = myMethod(array);
		
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static int[] myMethod(int[] arr){
        int temp = arr[0];
        for (int index1 = 0; index1 < arr.length; index1++) {
            for (int index2 = 1; index2 < arr.length; index2++) {
                if(arr[index2-1] > arr[index2]){
                    //swap elements
                    temp = arr[index2-1];
                    arr[index2-1] = arr[index2];
                    arr[index2] = temp;
                }
            }
        }
        return arr;
    }

}
