public class Task7{
    public static void main(String [] args){
        int arr[] = {1,10,100,148,20,12,16};
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");      
        }
        System.out.println();
        mergeSortRecursive(arr, 0, arr.length-1);
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static public void mergeSort(int [] numbers, int left, int mid, int right){
        int [] temp = new int[25];
        int i, leftEnd, numElement, tmpPos;
    
        leftEnd = (mid - 1);
        tmpPos = left;
        numElement = (right - left + 1);
    
        while ((left <= leftEnd) && (mid <= right)){
            if (numbers[left] <= numbers[mid]){
                temp[tmpPos++] = numbers[left++];}
            else{
                temp[tmpPos++] = numbers[mid++];}
        }
        while (left <= leftEnd){
            temp[tmpPos++] = numbers[left++];}
 
        while (mid <= right){
            temp[tmpPos++] = numbers[mid++];}
 
        for (i = 0; i < numElement; i++)
        {
            numbers[right] = temp[right];
            right--;
        }
    }
    static public void mergeSortRecursive(int [] numbers, int left, int right){
        int mid;
        if (right > left){
            mid = (right + left) / 2;
            mergeSortRecursive(numbers, left, mid);
            mergeSortRecursive(numbers, (mid + 1), right);
    
            mergeSort(numbers, left, (mid+1), right);
        }
    }
}
      
        
    
      
    