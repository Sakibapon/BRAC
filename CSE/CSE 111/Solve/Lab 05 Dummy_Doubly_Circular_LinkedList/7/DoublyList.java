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
  public int countNode()
  {
    int C=0;
    for (Node n =head.next; n!=head; n=n.next)
    {
      C++;
    }
    // TO DO
    
    return C; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void forwardprint()
  {
    for (Node n=head.next; n!=head; n=n.next)
    {
      System.out.print(n.element+", "); 
    }
    System.out.println();
    // TO DO    
  }
  
  public void backwardprint()
  {
    Node tail=head.prev;
    for (Node n=tail; n!=head; n=n.prev)
    {
      System.out.print(n.element+", ");
    }
    System.out.println();
    // TO DO     
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx)
  {
    if (idx<0 || idx>countNode())
    {
      return null;
    }
    else
    {
      int i=0;
      for (Node n=head.next; n!=head; n=n.next)
      {
        if (i==idx)
        {
          return n;
        }
        else
        {
          i++;
        }
      }
    }
    // TO DO
    
    return null; // please remove this line!
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem)
  {
    int i=0, box=0;
    for (Node n=head.next; n!=head; n=n.next)
    {
      if (n.element==elem)
      {
        box = i;
      }
      else
      {
        i++;
      }
    }
    if (i==countNode())
    {
      return -1;
    }
    else
    {
      return box;
    }
    // TO DO
    // please remove this line!
  }
  
  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx)
  {
    if (idx<0 || idx>countNode())
    {
      System.out.println("Invalid Index");
    }
    else
    {
      Node mn = new Node(elem, null, null);
      
      if (idx==0)
      {
        Node succ=head.next;
        mn.next=succ;
        head.next=mn;
        succ.prev=mn;
        mn.prev=head;
      }
      else
      {
        Node pred = nodeAt(idx-1);
        Node succ = pred.next;             
        mn.next = succ;
        mn.prev = pred;
        pred.next = mn;
        succ.prev = mn;
      }
    }
    
    // TO DO
    
  }
  
  
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index)
  {
    Object box=null;
    if (index<0 || index>countNode())
    {
      return null;
    }
    else if (index==0)
    {
      Node r=nodeAt(index);
      Node succ=nodeAt(index+1);
      head.next=succ;
      succ.prev=head;
      box=r.element;
      r.element=null;
      r.next=null;
      r.prev=null;
      r=null;
      return box;
    }
    else
    {
      Node r=nodeAt(index);
      Node pred=r.prev;
      Node succ=r.next;
      pred.next=succ;
      succ.prev=pred;
      box=r.element;
      r.element=null;
      r.next=null;
      r.prev=null;
      r=null;
      return box;
    }
    
    // TO DO
    // please remove this line!
  }
  
  
  
}