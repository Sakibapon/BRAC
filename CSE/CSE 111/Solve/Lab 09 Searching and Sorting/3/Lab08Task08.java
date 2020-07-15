import java.util.Scanner;
public class Lab08Task08{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int[]array=new int[sc.nextInt()];
        for(int count=0; count<array.length; count++){
            System.out.println("Please input the value to store in array: ");
            array[count]=sc.nextInt();
        }
        sort(0, array);
        for(int count = 0; count< array.length; count++) {
            if (count<array.length - 1){
                System.out.print(array[count] + ", ");
            }
            else{
                System.out.println(array[count]);
            }
        }
    }
    
   public static int max(int i,  int[] a) {
       if (i == a.length - 1){
           return i;
       }
        else {
            int m = max(i + 1, a);
            if (a[i] > a[m]){
                return i;
            }
            else{
                return m;
            }
        }
    }
    
    public static void sort(int i, int[] a) {
        if (i < a.length - 1) {
            int m = max(i + 1, a);
            if (a[i] < a[m]) {
                int temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }
            sort(i + 1, a);
        }
    }
}
