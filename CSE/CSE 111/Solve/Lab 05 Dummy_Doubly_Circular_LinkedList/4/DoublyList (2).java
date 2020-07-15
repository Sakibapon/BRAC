public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int count=0;
        for(Node counter=head.next; counter!=head; counter=counter.next){
            count++;
        }
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        for(Node count=head.next; count!=head; count=count.next){
            if(count.next!=head){
                System.out.print(count.element+",");
            }
            else{
                System.out.print(count.element+".");
            }
        }
        System.out.println();
    }
    
    public void backwardprint(){
        for(Node count=head.prev; count!=head; count=count.prev){
            if(count.prev!=head){
                System.out.print(count.element+",");
            }
            else{
                System.out.print(count.element+".");
            }
        }
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int counter=0;
        for(Node count=head.next; count!=head; count=count.next){
            if(counter==idx){
                return count;
            }
            counter++;
        }
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int counter=0;
        for(Node count=head.next; count!=head; count=count.next){
            if(count.element.equals(elem)){
                return counter;
            }
            counter++;
        }
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        if(idx>=0&&idx<=countNode()){
                Node temp=nodeAt(idx);
                if(temp==null){
                    temp=head;
                }
                Node nN=new Node(elem,null,null);
                temp.prev.next=nN;
                nN.next=temp;
                nN.prev=temp.prev;
                temp.prev=nN;
        }
        /*
         * 2nd way(Much Better)
         * int count=0;
         * Node temp=head.next;
         * for(; ;){
         * if(count==idx){
         * break;
         * }
         * temp=temp.next;
         * count++;
         * }
         */
        
        else{
            System.out.println("Sorry invalid index");
        }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        if(index>=0&&index<countNode()){
            Node temp=nodeAt(index);
            Object elem=temp.element;
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            return elem;
        }
        else{
            System.out.println("Invalid index");
            return null; // please remove this line!
        }
    }
}