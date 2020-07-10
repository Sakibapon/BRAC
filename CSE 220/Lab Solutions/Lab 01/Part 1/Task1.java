
/*Task 1:
        Given an array of ints, return true if 6 appears as either the first or last element in the array.
        The array will be length 1 or more.

        firstLast6 ({1, 2, 6}) → true
        firstLast6 ({6, 1, 2, 3}) → true
        firstLast6 ({13, 6, 1, 2, 3}) → false*/

import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Insert Array Length \t");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int index = 0; index < array.length; index++) {
            System.out.print("Please Insert Index Number " +(index+1)+ "\t");
            array[index] = scanner.nextInt();
        }
        System.out.println(myMethod(array));
    }

    public static boolean myMethod(int[] arr){
        if(arr[0] == 6 || arr[arr.length-1] == 6){
            return true;
        }
        else{
            return false;
        }
    }

}
