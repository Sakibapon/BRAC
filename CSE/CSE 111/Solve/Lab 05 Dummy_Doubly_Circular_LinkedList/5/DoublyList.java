public class DoublyList {
    
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
        for(Node n=head.next;n!=head;n=n.next)
        {
            count++;
        }
        return count;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        
        for(Node n=head.next;n!=head;n=n.next)
        {
            out.print(n.element+" ");            
        }
        out.println();
    }
    
    public void backwardprint(){
        
        for(Node n=head.prev;n!=head;n=n.prev)
        {
            out.print(n.element+" ");            
        }
        out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        
        if(idx<-1)
        {
            return null;
        }
        if(idx==-1)
        {
            return head;
        }
        int i=0;
        for(Node n=head.next;n!=head;n=n.next)
        {
            if(i==idx)
            {
                return n;
            }
            i++;
        }
        return null;
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        
        int i=0;
        for(Node n=head.next;n!=head;n=n.next)
        {
            if(n.element==elem)
            {
                return i;
            }
            i++;
        }
        return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        
        if(idx<-1)
        {
            out.println("Invalid Index");
        }
        Node mn=new Node(elem,null,null);
        Node pred=nodeAt(idx-1);
        Node succ=pred.next;
        mn.next=succ;
        mn.prev=pred;
        pred.next=mn;
        succ.prev=mn;
        
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        
        Node pred=nodeAt(index-1);
        Node rn=pred.next;
        Node succ=rn.next;
        pred.next=succ;
        succ.prev=pred;
        
        Object temp=rn.element;
        
        rn.element=null;
        rn.next=null;
        rn.prev=null;
        
        return temp;
    }
    
    
    
}
    

