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
    int i=0;
    for (Node n=head.next; n!=head; n=n.next){
      i++;
    }
    return i;
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    for (Node n=head.next; n!=head; n=n.next){
      if (n.next==head){
        System.out.println(n.element+".");
      }
      else{
        System.out.print(n.element+",");
      }
    }
  }
  
  public void backwardprint(){   
    for (Node n=head.prev; n!=head; n=n.prev){
      if (n.prev==head){
        System.out.println(n.element+".");
      }
      else{
        System.out.print(n.element+",");
      }
    }
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int i=0;        
    if (idx<0){
      throw new NullPointerException();          
    }
    else{
      for (Node n=head.next; n!=head; n=n.next){
        if (i==idx)
        {
          return n;
        }
        i++;
      }
    }
    return null;
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int i=0;
    for (Node n=head.next; n!=head; n=n.next){ 
      if (n.element==elem){
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
    if (idx<0 || idx>countNode())
    {
      System.out.println("invalid");
    }
    else{
      Node k=new Node(elem,null,null);
      if (idx==0){
        Node z=head.prev;
        k.next=head;
        head.prev=k;
        z.next=k;
        k.prev=z;
      }
      else{
        Node m=nodeAt(idx-1);
        Node l=m.next;
        k.next=l;
        l.prev=k;
        k.prev=m;
        m.next=k;
      }

    }
    
  }
  
  
  
  
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    if (index<0 || index>countNode())
    {
      System.out.println("invalid");      
    }
    else{
      if (index==0){
        Node z=head.next;
        Node y=z.next;
        head.next=y;
        y.prev=head;
        z.next=null;
        z.prev=null;
        return z.element;
      }
      else{
          Node m=nodeAt(index);
          Node l=m.next;
          Node k=m.prev;
          k.next=l;
          l.prev=k;
          m.next=null;
          m.prev=null;
          return m.element;
        }
      }
    
    return null;
  }
  
  
  
}
