import java.util.Scanner;
public class Task5 {
int foundAt=0;
    
    
    public int searchList(Node h, Object find){ 
        if(h!=null){
            if(find.equals(h.key.toString())){
                return foundAt; 
            } 
            else{ 
                foundAt++;
                return searchList(h.next, find); 
            } 
        } 
        return -1; 
    }
    
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        
        
        Object[] a={10,20,30,40,50};
        LinkedList aList=new LinkedList();
        aList.add(a,0,5);
        aList.printList(aList.head);
        System.out.println();
        System.out.println("---- --- --- ----");
        System.out.println(aList.size);
        System.out.println();
        
        Task5 x=new Task5();
        System.out.println("Enter a key to search");
        Object f=key.next();
        System.out.println("---- searching "+f+" ----");
        int found=x.searchList(aList.head, f);
        System.out.println(found);
    }

}
