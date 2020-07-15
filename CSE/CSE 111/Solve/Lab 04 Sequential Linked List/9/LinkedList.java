public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
    	Node k=new Node(a[i],null);
    	tail.next=k;
    	tail=k;
    }
  }
  
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int c=0;
    for(Node x=head;x!=null;x=x.next){
    	c++;
    }
    return c;
  }
  
  /* prints the elements in the list */
  public void printList(){
	  for(Node x=head;x!=null;x=x.next){
	    	System.out.print(x.element+" ");
	    }
	  System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    if(idx<0){
    	return null;
    }
    int c=0;
    for(Node x=head;x!=null;x=x.next){
    	if(idx==c){
    		return x;
    	}
    	else{
    		c++;
    	}
    }
    return null;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
	  if(idx<0){
	    return null;
	    }
	  int c=0;
	  for(Node x=head;x!=null;x=x.next){
		  if(idx==c){
			  return x.element;
		  }
		  else{
	    	c++;
		  }
	  }
	  return null;
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    Node node=nodeAt(idx);
    if(node==null){
    	return null;
    }
    else{
    	Object oldElem=node.element;
        node.element=elem;
        return oldElem;
    }
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
	  int i=0;
	  for(Node x=head;x!=null;x=x.next){
		  if(x.element.equals(elem)){
			  return i;
		  }
		  else{
			  i++;
		  }
	  }
    return -1;
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    for(Node x=head;x!=null;x=x.next){
    	if(x.element.equals(elem)){
    		return true;
    	}
    }
    return false;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node copyHead=new Node(head.element,null);
    Node copyTail=copyHead;
    for(Node x=head.next;x!=null;x=x.next){
    	Node k=new Node(x.element,null);
    	copyTail.next=k;
    	copyTail=k;
    }
    return copyHead; 
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node revHead=new Node(head.element,null);
    for(Node x=head.next;x!=null;x=x.next){
    	Node k=new Node(x.element,null);
    	k.next=revHead;
    	revHead=k;
    }
    return revHead;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    if(idx<0 || idx>countNode()){
    	System.out.println("Invalid Index");
    }
    Node newNode=new Node(elem,null);
    if(idx==0){
    	newNode.next=head;
    	head=newNode;
    }
    else{
    	Node preNode=nodeAt(idx-1);
    	newNode.next=preNode.next;
    	preNode.next=newNode;
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int idx){
    if(idx<0 || idx>countNode()){
    	System.out.println("Invalid index");
    }
    Node rmveNode=null;
    Object rtrnObj=null;
    if(idx==0){
    	rmveNode = head;
    	head = head.next;
    	
    }
    else{
    	Node preNode=nodeAt(idx-1);
    	rmveNode=preNode.next;
    	preNode.next=rmveNode.next;
    }
    rtrnObj=rmveNode.element;
    rmveNode.next=null;
    return rtrnObj;
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
	  Node oldHead=head;
	    head=head.next;
	    oldHead.next=null;
	    Node x;
	    for(x=head;x.next!=null;x=x.next){    
	    }
	    System.out.println(x.element);
	    x.next=oldHead;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
	  Node x;
	    for(x=head;x.next.next!=null;x=x.next){
	    }
	    //System.out.println(x.next.element);
	    Node newHead=x.next;
	    x.next=null;
	    newHead.next=head;
	    head=newHead;
  }
  
  public Node removeOdd(){
	  Node newHead=null;
	  Node newTail=null;
	  
	  for(Node x=head;x!=null;x=x.next){
		  if((int)x.element%2==0){
			  newHead=new Node(x.element,null);
			  head=x;
			  newTail=newHead;
			  break;
		  }
	  }
	  for(Node x=head.next;x!=null;x=x.next){
		  if((int)x.element%2==0){
			  Node k=new Node(x.element,null);
			  newTail.next=k;
			  newTail=k;
		  }
	  }
	    
	  head=newHead;
	  return head;
  }
  
}