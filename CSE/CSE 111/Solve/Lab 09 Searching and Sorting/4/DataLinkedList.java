class DataLinkedList {  
     public static class Node {
         int data; 
         Node next;
 
         public Node(int data) {
             this.data = data;
             this.next = null;       
         }
         public int getData() {
             return this.data;
         }
     }
     private  Node head;
     private int size; 

     public DataLinkedList(){
         this.head = null;
         this.size = 0;
     }
     public void add(int data) {
         Node node = new Node(data);
         if (head == null) {
             head = node;
         }
         else{
             Node current = head;
             while(current.next != null){
                 current = current.next;
             }
             current.next = node;
         }
         size++;
     }
     public void sort() {
        if (size > 1) {
         boolean wasChanged;
         
            do {
                Node current = head;
                Node previous = null;
                Node next = head.next;
                wasChanged = false;
                
                while ( next != null ) {
                    if (current.data > next.data) {
                           wasChanged = true;
                           if ( previous != null ) {
                               Node sig = next.next;
                               previous.next = next;
                               next.next = current;
                               current.next = sig;
                        } 
                         else {
                             Node sig = next.next;
                             head = next;
                             next.next = current;
                             current.next = sig;
                        }
                        previous = next;
                        next = current.next;
                    } 
                    else { 
                       previous = current;
                       current = next;
                       next = next.next;
                    }
                } 
            } while( wasChanged );
        }
    }

    public void printData() {
        Node current = head;
        
        System.out.print("[ ");
        while(current != null) {
            int data = current.getData();
            System.out.print(data + " ");
            current = current.next;
        }
        
        System.out.print(" ]");
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

