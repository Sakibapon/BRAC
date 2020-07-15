public class Task8{
    public static void main(String [] args){
        int arr[] = {1,10,100,148,20,12,16};
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");      
        }
        System.out.println();
        quickSort(arr);
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int[] a) {
        recursiveQuickSort(a, 0, a.length - 1);
    }
    public static void recursiveQuickSort(int[] a, int startIndex, int endIndex) {
        int index = partition(a, startIndex, endIndex); 
        if (startIndex < index - 1) {
             recursiveQuickSort(a, startIndex, index - 1);
        }
        if (endIndex > index) {
            recursiveQuickSort(a, index, endIndex);
        }
    }
    
    public static int partition(int[] a, int l, int r) {
        int pivot = a[l];
        while (l <= r) {
            while (a[l] < pivot) {
                l++;
            }
            while (a[r] > pivot) {
                r--;
            }
            if (l <= r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }
        return l;
    }
}
                

