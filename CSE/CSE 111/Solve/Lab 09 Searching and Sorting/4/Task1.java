public class Task1{
    public static void main(String [] args){
        int arr[] = {30,10,100,148,20,1,12,16};
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");      
        }
        System.out.println();
        Task1.selectionSort(arr,0,arr.length);
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int[] data, int l, int r) {
        if (l < r) {
            swap(data, l, findMin(data, l));
            selectionSort(data, l + 1, r);
        }
    }
    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static int findMin(int[] data, int z) {
        int min;
        if (z == data.length - 1){
            return z;
        }
        min = findMin(data, z + 1);
        if (data[min] < data[z]){
            return min;
        }
        
        else{
             return z;
        } 
    }
}