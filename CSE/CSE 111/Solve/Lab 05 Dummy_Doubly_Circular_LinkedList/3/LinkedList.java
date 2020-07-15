package lab5;
public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
     head= new Node(a[0],null);
     Node tail=head;
     for(int i=1;i<a.length;i++){
         Node mn= new Node(a[i],null);
         tail.next=mn;
         tail=tail.next;
     }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
      head=h;
    // TO DO
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
      int count=0;
 
      for(Node mn=head; mn!=null; mn=mn.next){
          count++;
  }
    // TO DO
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
       for(Node mn=head; mn!=null; mn=mn.next){
          System.out.print(mn.element + ",");
    // TO DO    
  }
       System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
      Node tail=head;
      if(idx<0 || idx>4){
          return null;
      }
      else{
      for(int i=0; i<=idx-1;i++){
          tail=tail.next;
          
      }
      
    // TO DO
    return tail; // please remove this line!
  }
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
    Node tail=head;
      if(idx<0 || idx>4){
          return null;
      }
      else{
      for(int i=0; i<=idx-1;i++){
          tail=tail.next;
          
      }
      
    // TO DO
    return tail.element; // please remove this line!
  } 
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    return -100; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    return null; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    return null; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    return null; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
  }
  
}