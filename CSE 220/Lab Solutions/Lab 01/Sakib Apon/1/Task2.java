
/*Task 2
Read in 10 input from the keyboard, and store them in an array.
Find the position (or index) of the maximum and minimum values in the array,
and swap them (move the biggest element to the position of the smallest,
and move the smallest element to the position of the biggest) and print that
again. If the user enters 7, 13, -5, 10, 6 then
your program should print 7, -5, 13, 10, 6
*/

import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Insert Array Length \t");
        int length = scanner.nextInt();
        int[] array = new int[length], index;

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
        int large = arr[0], small = arr[0], large_ind = 0, small_ind = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
                large_ind = i;
            }
            else{
                small = arr[i];
                small_ind = i;
            }
        }
        int temp = arr[large_ind];
        arr[large_ind] = arr[small_ind];
        arr[small_ind] = temp;
        return arr;
    }

}
