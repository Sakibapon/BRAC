import java.util.Scanner;
public class Task10{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        int month=keyboard.nextInt();
        int day=keyboard.nextInt();
        System.out.println(season(month,day));
    }
    static String season(int x,int y){
        if(x<3){ 
            return "Winter";       
        }
        if( x==3){ 
            if(y<16){
                return "Winter"; 
            }
            else{
                return "Spring";
            }  
        }
        if(x>3 && x<6){
            return "Spring";
        }
        if( x==6){ 
            if(y<16){
                return "Spring"; 
            }
            else{
                return "Summer";
            }
        }
        if(x>6 && x<9){
            return "Summer";
        }
        if( x==9){
            if(y<16){
                return "Summer"; 
            }
            else{
                return "Fall";
            }  
        }
        if(x>9 && x<12){
            return "Fall";
        }
        if( x==12){ 
            if(y<16){
                return "Fall"; 
            }
            else{
                return "Winter";
            } 
        }
        else{
            return "";
        }
    }
}