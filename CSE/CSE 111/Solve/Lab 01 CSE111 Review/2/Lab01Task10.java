import java.util.Scanner;
public class Lab01Task10{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month : ");
        int month=sc.nextInt();
        System.out.println("Please enter the date : ");
        int date=sc.nextInt();
        System.out.println(season(month,date));
    }
    
    public static String season(int month, int day){
        String print=""; 
        
        if(month<=3 || month==12){
            if((month==3) && day>=16){
                print="Spring";
            }
            else if((month==3) && day<=15){
                print="Winter";
            }
            else if((month==12) && day>=16){
                print="Winter";
            }
            else if((month==12) && day<=15){
                print="Fall";
            }
            else if((month==1) || month==2){
                print="Winter";
            }
        }
        
        else if(month>=9){
            if((month==9) && day>=16){
                print="Fall";
            }
            else if((month==9) && day<=15){
                print="Summer";
            }
            else if(month==10 || month==11){
                print="Fall";
            }
        }
        
        else if(month>=6){
            if((month==6) && day>=16){
                print="Summer";
            }
            else if((month==6) && day<=15){
                print="Spring";
            }
            else if(month==7 || month==8){
                print="Summer";
            }
        }
        
        else if(month==4 || month==5){
            print="Spring";
        }
        
        return print;
    }
}
