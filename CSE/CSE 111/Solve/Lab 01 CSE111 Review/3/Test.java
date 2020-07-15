public class Test{
    public static int [] removeOdd (int [] input){
        int evencounter=0;
        for(int counter=0 ; counter<input.length ;counter++){
            if(input[counter]%2==0){
                evencounter++;
            }
            else{  
            }
        }
        int evenarray[]=new int [evencounter];
        int counter2=0;
        for(int counter1=0 ; counter1<input.length ; counter1++){   
            if(input[counter1]%2==0){
                evenarray[counter2]=input[counter1];
                counter2++;
            }
            else{    
            }
        }
        return evenarray;
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++){
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++){
            System.out.print(noOdd[i] + " ");
        }    
    }
}
