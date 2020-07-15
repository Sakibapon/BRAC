public class Task6{
    public static void main(String [] args){
        int arr[] = {5,7,10,12,15,19,25};
        int index1 = binarySearch(arr,0,arr.length,5);
        System.out.println("5 was found at" + " index " +index1);
        int index2 = binarySearch(arr,0,arr.length,7);
        System.out.println("7 was found at" + " index " +index2);
        int index3 = binarySearch(arr,0,arr.length,10);
        System.out.println("10 was found at" + " index " +index3);
        int index4 = binarySearch(arr,0,arr.length,12);
        System.out.println("12 was found at" + " index " +index4);
        int index5 = binarySearch(arr,0,arr.length,15);
        System.out.println("15 was found at" + " index " +index5);
        int index6 = binarySearch(arr,0,arr.length,19);
        System.out.println("19 was found at" + " index " +index6);
        int index7 = binarySearch(arr,0,arr.length,25);
        System.out.println("25 was found at" + " index " +index7);
        int index8 = binarySearch(arr,0,arr.length,55);
        System.out.println("55 was found at" + " index " +index8);
    }
    public static int binarySearch(int [] a,int l,int r,int k){
        if(l<r){
            int mid = (l+r)/2;
            if(k==a[mid]){
                return mid;
            }
            else if (k>a[mid]){
                return binarySearch(a,mid+1,r,k);
            }
            else{
                return binarySearch(a,l,mid,k);
            }
        }
        return -1;
    }
}