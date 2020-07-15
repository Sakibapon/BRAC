import java.util.*;
public class LinearArray
{
    public static void main(String [] args)
    {
        int [] a = {10, 20, 30, 40, 50, 60};
        
        System.out.println("\n///// TEST 01: Copy Array example /////");
        int [] b = copyArray(a, a.length);
        printArray(b);
        
        System.out.println("\n///// TEST 02: Print Reverse example /////");
        printArray(a);
        printReverse(a);
        
        System.out.println("\n///// TEST 03: Reverse Array example /////");
        reverseArray(b);
        printArray(b);
        
        System.out.println("\n///// TEST 04: Shift Left k cell example /////");
        b = copyArray(a, a.length);
        b=shiftLeft(b,3);
        printArray(b);
        
        System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
        b = copyArray(a, a.length); 
        printArray(b);  
        b=rotateLeft(b,3);
        printArray(b);
        
        System.out.println("\n///// TEST 06: Shift Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); 
        b=shiftRight(b,3);
        printArray(b);
        
        
        System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); 
        b=rotateRight(b,3);
        printArray(b); 
        
        System.out.println("\n///// TEST 08: Insert example 1 /////");
        
        b = copyArray(a, a.length);
        printArray(b);  
        boolean bol=insert(b,6, 70, 2); 
        System.out.println(bol);
        printArray(b);
        
        System.out.println("\n///// TEST 09: Insert example 2 /////");
        int [] c = {10, 20, 30, 40, 50, 0, 0}; 
        printArray(c);  
        bol=insert(c,5, 70, 2);  
        System.out.println(bol); 
        printArray(c);
        
        System.out.println("\n///// TEST 10: Insert example 3 /////");
        printArray(c);  
        bol=insert(c,6, 70, 6); 
        System.out.println(bol); 
        printArray(c);
        
        System.out.println("\n///// TEST 11: Remove example 1 /////");
        
        printArray(c); 
        bol=removeAll(c,7,90);
        System.out.println(bol);
        printArray(c); 
        
        System.out.println("\n///// TEST 12: Remove example 2 /////");
        printArray(c); 
        bol=removeAll(c,7,70);
        System.out.println(bol);
        printArray(c);
    }
    
    public static void printArray(int [] source)
    {
        System.out.println(Arrays.toString(source));
    }
    
    public static int[] copyArray(int [] source, int len)
    {
        int[] a = new int[len];
        for (int i = 0;i < a.length;i++)
            a[i] = source[i];
        
        return a;
    }
    
    public static void printReverse(int [] source)
    {
        for (int i = source.length-1;i >= 0;i--)
        {
            System.out.print(source[i]+" ");
        }
    }
    
    public static void reverseArray(int [] source)
    {
        for (int i = 0;i < source.length-i;i++)
        {
            int temp = source[i];
            source[i] = source[source.length-1-i];
            source[source.length-1-i] = temp;
        }
    }
    
    public static int[] shiftLeft(int [] source, int k)
    {
        for (int i = 0;i < k;i++)
        {
            source[i] = source[k+i];
            source[k+i] = 0;
        }
        
        return source;
    }
    
    public static int [] rotateLeft(int [] source, int k)
    {
        for (int i = 0;i < k;i++)
        {
            int temp = source[i];
            source[i] = source[k+i];
            source[k+i] = temp;
        }
        
        return source;
    }
    
    public static int [] shiftRight(int [] source, int k)
    {
        for (int i = 0;i < k;i++)
        {
            source[k+i] = source[i];
            source[i] = 0;
        }
        
        return source;
    }
    
    public static int [] rotateRight(int [] source, int k)
    {
        for (int i = 0;i < k;i++)
        {
            int temp = source[k+i];
            source[k+i] = source[i];
            source[i] = temp;
        }
        
        return source;
    }
    
    public static boolean insert(int [] arr, int size, int elem, int index)
    {
        boolean b = false;
        
        if (size == arr.length)
        {
            System.out.println("No Space Left.");
        }
        
        else if (index >= arr.length)
        {
            System.out.println("Invalid Index.");
        }
        
        else
        {
            for (int i = arr.length-1; i > index; i--)
                arr[i] = arr[i-1];
            arr[index] = elem;
            b = true;
            System.out.println("Number of elements after insertion: "+(size+1));
        }
        
        return b;
    }
    
    public static boolean removeAll(int [] arr, int size, int elem)
    {
        boolean b = false;
        int count = 0;
        
        for (int i = 0;i < arr.length;i++)
        {
            if (elem == arr[i])
            {
                count++;
                arr[i] = 0;
                b = true;
            }
        }
        
        if (b == true)
        {
            for (int i = 0;i < arr.length;i++)
            {
                if (arr[i] == 0)
                {
                    for (int j = i;j < arr.length-1;j++)
                        arr[j] = arr[j+1]; 
                }
                
                arr[arr.length-1] = 0;
             }
            System.out.println("Number of elements after removal: "+(size - count));
        }
        
        return b;
    }
}
