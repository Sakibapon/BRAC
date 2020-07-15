public class Task2{
    public static void main(String [] args){
        int arr[] = {1,10,100,148,20,12,16};
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");      
        }
        System.out.println();
        Task2.insertionSort(arr,0,arr.length);
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(int[] a, int l, int r) {
        if (l < a.length) {
            if (r < a.length) {
                if (a[l] > a[r]) {
                    a[l] += a[r];
                    a[r] = a[l] - a[r];
                    a[l] = a[l] - a[r];
                }
                insertionSort(a,l, r+1);
                return;
            }
             if (r == a.length) {
                 l++;
             }
             insertionSort(a, l, l+1);
        }
    }
}