/*Task 10
Write a method named season that takes two integers as parameters representing a month and day and that 
returns a String indicating the season for that month and day. Assume that months are specified as an 
integer between 1 and 12 (1 for January, 2 for February, and so on) and that the day of the month is a 
number between 1 and 31.
*/

import java.util.*;

class Task10{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        String s = season(month,day);
        System.out.println(s);
    }

    static String season(int m, int d){

        if(m <= 2 || (m == 3 && d <= 15) || (m == 12 && d > 15)){
            return "Winter";
        }
        else if(m <= 5 || (m == 6 && d <= 15)){
            return "Spring";
        }
        else if(m <= 8 || (m == 9 && d <= 15)){
            return "Summer";
        }
        else{
            return "Fall";
        }
    }


}
