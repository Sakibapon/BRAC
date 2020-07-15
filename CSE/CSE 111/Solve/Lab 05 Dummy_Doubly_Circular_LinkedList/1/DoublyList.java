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
    // TO DO
    int count=0;
    if(head==null)
    {
      return 0;
    }
    else{
      for(Node n=head.next; n!=head; n=n.next)
      {
        count++;
      }
      return count; // please remove this line!
    }
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    // TO DO
    for(Node n=head.next; n!=head; n=n.next)
    {
      System.out.print(n.element);
      if(n.next==head)
      {
        System.out.print(".");
      }
      else
      {
        System.out.print(",");
      }
    }
    System.out.println();
  }
  
  public void backwardprint(){
    // TO DO
    for(Node n=head.prev; n!=head; n=n.prev)
    {
      System.out.print(n.element);
      if(n.prev==head)
      {
        System.out.print(".");
      }
      else
      {
        System.out.print(",");
      }
    }
    System.out.println();
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    if(idx<0 || idx>=countNode())
    {
      return null;
    }
    else
    {
      Node n=head.next;
      for(int i=0; i!=idx; i++)
      {
        n=n.next;
      }
      return n;
    }
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    int i=0;
    for(Node n=head.next; n!=head ; n=n.next)
    {
      if(n.element.equals(elem))
      {
        return i;
      }
      else
      {
        return -1;
      }
      //i++;
    }
    return i;
  }
  
  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    int count=0;
    Node temp;
    Node nn = new Node(elem,null,null);
    for(Node i=head.next ; i!=head ; i=i.next) {
      if(count==idx) {
        i.prev.next=nn;
        temp = i.prev;
        i.prev=nn;
        nn.next=i;
        nn.prev=temp;
        break;
      }
      count++;
    }
  }
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    Node n=nodeAt(index);
    Object temp= n.element;
    n.prev.next=n.next;
    n.next.prev=n.prev;
    return temp;
  }
  
  
  
}