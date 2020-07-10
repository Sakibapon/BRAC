

class Task13{

    public static int[] removeOdd (int[] input){
        int c=0, j, k=0, l;

        for(j=0;j<input.length;j++){
            if(input[j]%2==0){
                c++;
            }
        }
        int[] output = new int[c];

        for(l=0;l<input.length;l++){
            if(input[l]%2==0){
                output[k]=input[l];
                k++;
            }
        }
        return output;
    }
    
    public static void main(String [] args){

        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};

        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();

        int[] noOdd = removeOdd(mixedArray);

        for(int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }
        System.out.println();
    }
}


