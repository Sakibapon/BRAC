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
        for(Node h=head.next ; h!=head ;h=h.next ){
            count++;
        }
        
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        for(Node h=head.next ; h!=head ;h=h.next ){
            if(h.next.element!=null){
                System.out.print(h.element +",");
            }
            else{
                System.out.print(h.element +". ");
            }
        }
        System.out.println();
    }
    
    public void backwardprint(){
        // TO DO 
        int t=countNode();
        for(Node h=nodeAt(t-1) ; h!=head ; h=h.prev){
            if(h.prev.element!=null){
                System.out.print(h.element +",");
            }
            else{
                System.out.print(h.element +". ");
            }
        }
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        if(idx<0){
            return head;
        }
        int count=0;
        for(Node h=head.next ; h!=head ; h=h.next,count++){
            if(count==idx){
                return h;
            }
        }
        
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int count=0;
        for(Node h=head.next ; h!=head ; h=h.next,count++){
            if(h.element==elem){
                return count;
            }
        }
        
        
        
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
//        if(idx<0){
//        System.out.println("invalid index");
//        }
//        else if(idx!=0){
//        Node b=nodeAt(idx-1);    
//        Node a=nodeAt(idx+1);
//        Node p=nodeAt(idx);
//        p=new Node(elem,a,b);
//        System.out.println(p.next.element);
//        nodeAt(idx).next=p;
//        nodeAt(idx+1).prev=p;
//        }
//        else if(idx==countNode()){
//        Node d=nodeAt(idx-1);
//        Node n=new Node(elem,head,d);
//        d.next=n;
//        }
//        else{
//         Node a=nodeAt(idx+1);
//        Node p=nodeAt(idx);
//        
//        }
        Node p = nodeAt(idx-1);
        Node n = new Node(elem, null, null);
        Node q = p.next; 
        n.next = q;
        n.prev = p;
        p.next = n;
        q.prev = n;
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        if(index<0 && index > countNode()){
            return null;
        }
//        else if (index!=0){
//            Node b=nodeAt(index-1);
//            Node a=nodeAt(index+1);
//            Node p=nodeAt(index);
//            Object temp=p.element;
//            p=new Node(null,a,b);
//            b.next=p;
//            a.prev=p;
//            return temp;
//        }
//        else{
//            Node a=nodeAt(index+1);
//            Node p=nodeAt(index);
//            Object temp=p.element;
//            p=new Node(null,a,head);
//            head.next=p;
//            a.prev=p;
//            return temp;
//        }
        Node n=nodeAt(index);
        Node p = n.prev;
        Node q = n.next;
        p.next = q;
        q.prev = p;
        n.next = n.prev = null;
        return n.element;
        
    }
}