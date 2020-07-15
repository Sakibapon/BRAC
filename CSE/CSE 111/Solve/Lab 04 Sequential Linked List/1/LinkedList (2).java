public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
      head= new Node(a[0],null);
      Node tail=head;
      for(int i=1; i<a.length; i++){
          Node k=new Node(a[i],null);
          tail.next=k;
          tail=tail.next;
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
    int count=0;
    for(Node n=head; n!=null; n=n.next){
        count++;
    }
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
      for(Node n=head; n!=null; n=n.next){
          if(n.next!=null){
              System.out.print(n.element+",");
          }
          else{
              System.out.println(n.element+".");
          }
      }   
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
      if(idx<0){
          return null;
      }
      int myIndex=0;
      for(Node n=head; n!=null; n=n.next,myIndex++){
          if(myIndex==idx){
              return n;
          }
      }
      return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    if(idx<0){
          return null;
      }
      int myIndex=0;
      for(Node n=head; n!=null; n=n.next,myIndex++){
          if(myIndex==idx){
              return n.element;
          }
      }
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    if(idx<0){
          return null;
      }
    Object ob;
      int myIndex=0;
      for(Node n=head; n!=null; n=n.next,myIndex++){
          if(myIndex==idx){
              ob=n.element;
              n.element=elem;
              return ob;
          }
      }
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
      int index=0;
      for(Node n=head; n!=null; n=n.next,index++){
          if(n.element==elem){
              return index;
          }
      }
      return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
      for(Node count=head; count!=null; count=count.next){
          if(count.element==elem){
              return true;
          }
      }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node newHead=new Node(head.element, null);
    Node tail=newHead;
    
    for(Node count=head.next; count!=null; count=count.next){
        Node ng=new Node(count.element, null);
        tail.next=ng;
        tail=tail.next;
    }
    return newHead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node newHead=new Node(head.element, null);
    
    for(Node count=head.next; count!=null; count=count.next){
        Node ng=new Node(count.element, newHead);
        newHead=ng;
    }
    return newHead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
      if(idx<=countNode()){
          if(idx==0){
             Node temp=head;
             Node newNode=new Node(elem,head);
             head=newNode;
          }
          else if(idx<=countNode()){
              Node temp=nodeAt(idx-1);
              Node newNode=new Node(elem,temp.next);
              temp.next=newNode;
          }
      }
          
      else{
          System.out.println("Sorry invalid index !");
      }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
      if(index!=0&&index>0&&index<countNode()){
          Node before=nodeAt(index-1);
          Node temp=nodeAt(index);
          before.next=temp.next;
          return temp.element;
      }
      else if(index==0){
          Object temp=head.element;
          head=head.next;
          return temp;
      }
      else{
          System.out.println("Sorry invalid index !");
      }
      return null;
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    int run=countNode();
    Node temp=head, keep=head;
    
    if(run==1||run==0){
    }
    
    else{
        head=head.next;
        Node last=nodeAt(run-2);
        temp.next=null;
        last.next=temp;
    }
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
      int run=countNode();
      if(run==1||run==0){
      }
      else{
          Node temp=nodeAt(run-1);
          Node last=nodeAt(run-2);
          temp.next=head;
          head=temp;
          last.next=null;
      }
  }
}