/*Task 12
Write a method before that takes as parameters two month/day combinations and that returns whether or 
not the first date comes before the second date (true if the first month/day comes before the second 
month/day,false if it does not). The method will take four integers as parameters that represent the 
two month/day combinations.
*/

package com.company;


import java.util.*;
class Task12{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        int month1=scanner.nextInt(),month2=scanner.nextInt();
        int day1=scanner.nextInt(),day2=scanner.nextInt();
        int i;

        for(i = 0; i < 1; i++){
            if(month1<1||month1>12||day1<1||day1>31||(month1==2&&day1>29)||((month1==9||month1==4||month1==6||month1==11)&&day1>30)){
                System.out.println("your input is wrong.Input again please.");
                month1=scanner.nextInt();
                day1=scanner.nextInt();
                i--;
            }
        }

        for(i=0;i<1;i++){
            if(month2<1||month2>12||day2<1||day2>31||(month2==2&&day2>29)||((month2==9||month2==4||month2==6||month2==11)&&day2>30)){
                System.out.println("Invalid month or date. Enter again please.");
                month2=scanner.nextInt();
                day2=scanner.nextInt();
                i--;
            }
        }

        Task12 t=new Task12();
        System.out.println(t.myMethod(month1,month2,day1,day2));
    }

    public boolean myMethod(int m1,int m2,int d1,int d2){
        if(m1 < m2){
            return true;
        }else if(m1 == m2 && d1 < d2){
            return true;
        }else{
            return false;
        }
    }
}
