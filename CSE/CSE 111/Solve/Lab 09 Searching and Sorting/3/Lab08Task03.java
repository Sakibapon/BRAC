import java.util.Scanner;
public class Lab08Task03{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int[]array=new int[sc.nextInt()];
        for(int count=0; count<array.length; count++){
            System.out.println("Please input the value to store in array in assending order: ");
            array[count]=sc.nextInt();
        }
        System.out.println("Please input the value to search: ");
        int key=sc.nextInt();
        System.out.println("Index of the key is: "+search(array, key, 0, array.length-1));
    }
    public static int search(int[] array, int key, int start, int end){
        int mid=(start + end)/2;
        if(array[mid]>key){
            return search(array, key, start, mid-1);
        }
        else if(array[mid]<key){
            return search(array, key, mid+1, end);
        }
        else{
            return mid;
        }
    }
}