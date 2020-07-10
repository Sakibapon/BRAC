/*Task 11
Write a method named allDigitsOdd that returns whether every digit of a positive integer is odd. 
Your method should return true if the number consists entirely of odd digits and false if any of its 
digits are even. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.
*/


import java.util.*;
public class Task11{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(allDigitsOdd(number));
    }
    
    static boolean allDigitsOdd(int num){

        int temp = num, digits = 0, even = 0, odd = 0;

        while(num > 0){
            int i = num%10;
            digits++;
            if(i % 2 == 0){
                even++;
            }
            else if(i % 2 != 0){
                odd++;
            }
            num = num / 10;
        }
        if(odd == digits){
            return true;
        }
        else{
            return false;
        }
    }
}