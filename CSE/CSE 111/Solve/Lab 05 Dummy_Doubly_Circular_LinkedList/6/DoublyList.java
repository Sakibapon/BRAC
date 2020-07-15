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
            Node k = new Node(a[i], null, null);
            tail.next = k;
            k.prev=tail;
            tail=k;
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
        int c=0;
        for(Node x = head.next;x!=head;x=x.next){
        	c++;
        }
        return c;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
    	for(Node x = head.next;x!=head;x=x.next){
        	System.out.print(x.element+" ");
        }  
    	System.out.println();
    }
    
    public void backwardprint(){
    	for(Node x = head.prev;x!=head;x=x.prev){
        	System.out.print(x.element+" ");
        }     
    	System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        if(idx<0 || idx>=countNode())
        	return null;
        int c=0;
        for(Node x=head.next;x!=head;x=x.next){
        	if(c==idx)
        		return x;
        	else
        		c++;
        }
        
        return null;
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int c=0;
        for(Node x=head.next;x!=head;x=x.next){
        	if(x.element.equals(elem)){
        		return c;
        	}
        	else
        		c++;
        }  
        return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        Node newNode=new Node(elem,null,null);
        
    	if(idx <0 || idx>countNode()){
        	System.out.println("Invalid Index!!");
        }
    	else if(idx==0){
        	Node k=head.next;
        	head.next=newNode;
        	newNode.prev=head;
        	newNode.next=k;
        	k.prev=newNode;   	
        }
        else if(idx==countNode()-1){
        	Node k=nodeAt(countNode()-1);
        	k.next=newNode;
        	newNode.prev=k;
        	newNode.next=head;
        	head.prev=newNode;   	
        }
        else{
        	Node preNode=nodeAt(idx-1);
        	Node k=preNode.next;
        	preNode.next=newNode;
        	newNode.prev=preNode;
        	newNode.next=k;
        	k.prev=newNode;	
        }
                
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int idx){
        Node rmvNode=null;
        Object rmvElem=null;
        if(idx<0 || idx>countNode())
        	return null;
        else if(idx==0){
        	Node k=head.next.next;
        	rmvNode=head.next;
        	head.next=k;
        	k.prev=head;
        }
        else if(idx==countNode()-1){
        	Node k=nodeAt(idx);
        	rmvNode=k;
        	k.prev.next=k.next;
        	head.prev=k.prev;
        }
        else{
        	Node preNode=nodeAt(idx-1);
        	Node k=preNode.next.next;
        	rmvNode=preNode.next;
        	preNode.next=k;
        	k.prev=preNode;
        }
        
        rmvElem=rmvNode.element;
        rmvNode.next=null;
        rmvNode.prev=null;
        return rmvElem;
    }
    
    
    
}