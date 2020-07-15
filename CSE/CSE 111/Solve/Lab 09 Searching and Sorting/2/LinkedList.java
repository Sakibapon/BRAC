
public class LinkedList {
	Node head;
    Node tail;
    int size;
    
    public void add(Object[] a, int start, int end){
        if(start==end){
            return;
        }
        else{
            if(head==null){
                head=new Node(a[start], null);
                tail=head;
            }
            else{
                Node n=new Node(a[start], null);
                tail.next=n;
                tail=n;
            }
            
            size++;
            add(a,start+1,end);
        }
    }
    
    /* prints the elements in the list */
    public static void printList(Node head){
        if(head==null){
            return;
        }
        else{
            System.out.print(head.key);
            if(head.next!=null){
                System.out.print(", "); 
            }
            else{
                System.out.print("."); 
            }
            printList(head.next);
        }
    }

}
