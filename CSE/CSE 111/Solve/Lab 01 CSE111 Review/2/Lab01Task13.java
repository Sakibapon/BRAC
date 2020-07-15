public class Lab01Task13{
    public static int [] removeOdd (int [] input){
        int totalEven=0;
        for(int count=0; count<input.length; count++){
            if(input[count]%2==0){
                totalEven++;
            }
        }
        
        int[] compactArray = new int[totalEven];
        int lastPosition=-1;
        
        for(int count=0; count<compactArray.length; count++){
            for(lastPosition=lastPosition+1; lastPosition<input.length; lastPosition++){
                if(input[lastPosition]%2==0){
                    compactArray[count]=input[lastPosition];
                    break;
                }
            }
        }
        
        return compactArray;
    }
    
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
}